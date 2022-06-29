package src.main.java.com.IlonaA.javacore.chapter03;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10){
            int y = 20;
            System.out.println("x и y : " + x + " " + y);
        }
        //y = 100; ОШИБКА видимости переменной
        System.out.println("x равно :" + x);
    }
}
