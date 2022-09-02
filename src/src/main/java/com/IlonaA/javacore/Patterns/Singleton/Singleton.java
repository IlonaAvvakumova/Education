package src.main.java.com.IlonaA.javacore.Patterns.Singleton;

import java.util.Locale;

public class Singleton {
    private static Singleton instance; //переменная класса
    private static Integer count = 5;
    private static final Integer parol = 566;

    private Singleton() {
    }// private конструктор класса

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void enterPassword(Integer password) {
        if (count > 0 && !(password.equals(parol))) {
            System.out.println("Вы ввели не верный пароль, количество попыток: " + count);
            count--;
        } else if (count == 0) {
            System.out.println("Вы исчерпали количество попыток ввода");
        } else
            System.out.println("Система разблокирована");
    }
}

