package src.main.java.com.IlonaA.javacore.Case.module_1.Potok2;
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

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Fooo {
    Semaphore semaphore1 = new Semaphore(0);
    Semaphore semaphore2 = new Semaphore(1);
    Semaphore semaphore3 = new Semaphore(0);

    public void first(Runnable r) throws InterruptedException {

        semaphore2.acquire();
        System.out.print("first");
        semaphore1.release();

    }

    public void second(Runnable r) throws InterruptedException {

        semaphore1.acquire();
        System.out.print("second");
        semaphore3.release();

    }

    public void third(Runnable r) throws InterruptedException {

        semaphore3.acquire();
        System.out.print("third");
    }
}

class Vv {
    public static void main(String[] args) throws InterruptedException {
        Fooo foo = new Fooo(); // объект
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
