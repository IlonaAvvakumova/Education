package src.main.java.com.IlonaA.javacore.Case.module_1.Potok;
/*Задание 1
        Дан класс:
public class Foo {
    public void first(Runnable r) { print("first"); }
    public void second(Runnable r) { print("second"); }
    public void third(Runnable r) { print("third"); }
}
    Один и тот же экземпляр данного класса будет вызван 3мя разными потоками. Поток А - будет вызывать метод first(). Поток B - second().
     Поток С - third().
        Необходимо реализовать механизм и изменить программу таким образом, что методы класса Foo будут вызваны в правильном порядке.
        Пример:
        Вывод: "firstsecondthird"
        Мы не знаем, в каком порядке будут вызваны методы, но должны гарантировать порядок.*/

import java.util.concurrent.locks.*;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    int bul = 0;
    Lock lock = new ReentrantLock();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();

    public void first(Runnable r) throws InterruptedException {
        try {
            lock.lock();
            System.out.print("first");
            bul = 1;
        } finally {
            condition2.signal();
            lock.unlock();
        }
    }

    public void second(Runnable r) throws InterruptedException {
        try {
            lock.lock();
            while (bul != 1) {
                condition2.await();
            }
            System.out.print("second");
            bul = 2;
        } finally {
            condition3.signal();
            lock.unlock();
        }
    }

    public void third(Runnable r) throws InterruptedException {
        try {
            lock.lock();
            while (bul != 2) {
                condition3.await();
            }
            System.out.print("third");
        } finally {
            lock.unlock();
        }
    }
}

class V {
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo(); // объект
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.second(this);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread C = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.third(this);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    foo.first(this);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        C.start();
        B.start();
        A.start();
    }
}
