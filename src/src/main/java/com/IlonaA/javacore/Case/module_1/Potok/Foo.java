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

public class Foo {
    private int bul = 0;
    public synchronized void first(Runnable r) throws InterruptedException {
        while (bul!=0)
            wait();
        System.out.print("first");
        bul = 1;
        notifyAll();

    }
    public synchronized void second(Runnable r) throws InterruptedException {
       while (bul!=1)
           wait();
        System.out.print("second");
        bul =2;
        notifyAll();
    }
    public  synchronized void third(Runnable r) throws InterruptedException {
while (bul!=2)
    wait();
         System.out.print("third");
        notifyAll();
    }
}

class V{
    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo(); // объект
        Thread A = new Thread(() -> {
            try {
                foo.first(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread B = new Thread(() -> {
            try {
                foo.second(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread C = new Thread(() -> {
            try {
                foo.third(new Thread());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        C.start();
        B.start();
        A.start();
    }}
