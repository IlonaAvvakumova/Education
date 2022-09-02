package src.main.java.com.IlonaA.javacore.Patterns.Singleton;
/*Продемонстрировать работу паттерна Singleton на примере ввода пароля пользователем*/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.enterPassword(263);
        singleton.enterPassword(263);
        singleton.enterPassword(566);
    }
}
