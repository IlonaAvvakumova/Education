package src.main.java.com.IlonaA.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
       Thread t = Thread.currentThread(); //ссылка на текущий поток исполнения
       // Thread t = new Thread();
        System.out.println("Текущий поток исполнения: " + t + "приоритет потока: " + t.getPriority() );
        //изменить имя потока исполнения
        t.setName("My Thread");
        System.out.println("После изменения имени потока: " + "\n новое имя потока: " + t.getName() + "\n группа потока: " + t.getThreadGroup());

        try {
            for (int i = 3; i >0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
