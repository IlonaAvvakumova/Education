package src.main.java.com.IlonaA.javacore.Patterns.Observer;

public class Youtuber2 implements Observer{
    @Override
    public void call(String msg) {
        System.out.println("Второй пользователь уведомлен о новом ролике, он получил сообщение: " + "\n"+msg);
    }
}
