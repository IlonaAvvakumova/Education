package src.main.java.com.IlonaA.javacore.chapter10;

public class TrowsDemo {
    static void throwsOne () throws IllegalAccessException{
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwsOne();
        }catch (IllegalAccessException e) {
            System.out.println("перехвачено исключение: " + e);
        }
    }
}
