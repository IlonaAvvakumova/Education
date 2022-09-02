package src.main.java.com.IlonaA.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        ThreadJoin ob1 =  new ThreadJoin("Один"); // запустить потоки на исполнение
        ThreadJoin ob2 = new ThreadJoin("Два");
        ThreadJoin ob3 =  new ThreadJoin("Три");

        System.out.println("Поток Один запущен: "  + ob1.t.isAlive());
        System.out.println("Поток Два запущен: "  + ob2.t.isAlive());
        System.out.println("Поток Три запущен: "  + ob3.t.isAlive());

        try {
            //ожидать завершения других потоков исполнения
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Поток Один запущен: "  + ob1.t.isAlive());
        System.out.println("Поток Два запущен: "  + ob2.t.isAlive());
        System.out.println("Поток Три запущен: "  + ob3.t.isAlive());
        System.out.println("Главный поток завершен");
    }
}
class ThreadJoin implements Runnable{

    String name; // имя поток исполнения
    Thread t;
    ThreadJoin(String threadname){
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