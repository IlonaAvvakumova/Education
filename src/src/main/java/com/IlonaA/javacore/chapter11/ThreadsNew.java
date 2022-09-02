package src.main.java.com.IlonaA.javacore.chapter11;
//Создать несколько потоков исполнения

public class ThreadsNew implements Runnable{
    String name; // имя поток исполнения
    Thread t;
    ThreadsNew(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start();// запустить поток на исполнение
    }
    //точка входа в поток исполнения
    public void run(){
        try {
            for (int i = 5; i >0 ; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Prervan");
        }
        System.out.println(name+ " завершен.");
    }
}
class MultiThreadDemo{
    public static void main(String[] args) {
        new ThreadsNew("Один"); // запустить потоки на исполнение
        new ThreadsNew("Два");
        new ThreadsNew("Три");

        try {
            //ожидать завершения других потоков исполнения
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }

}
