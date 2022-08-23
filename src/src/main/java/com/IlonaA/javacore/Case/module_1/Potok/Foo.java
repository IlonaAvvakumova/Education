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

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {
    private int bul = 0;
    private Lock lock= new ReentrantLock();
    public  void first(Runnable r) {
        while (bul!=0)
            lock.unlock();
        System.out.print("first");
        lock.lock();
        bul = 1;
    }
    public  void second(Runnable r)  {
       while (bul!=1)
           lock.unlock();
        System.out.print("second");
        lock.lock();
        bul =2;
    }
    public   void third(Runnable r)  {
while (bul!=2)
    lock.unlock();
         System.out.print("third");
        lock.lock();
    }
}
class V{
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo(); // объект
        Thread A = new Thread();
               foo.first(A);
        Thread B = new Thread();
        foo.second(B);

        Thread C = new Thread();
        foo.third(C);

        C.start();
        B.start();
        A.start();
    }}
