package src.main.java.com.IlonaA.javacore.chapter08;

public class A { // супер класс
    int i, j;
    private int x;

    void showij() {
        System.out.println("i и j:" + i + " " + j);
    }

}

class B extends A { //B подскласс суперкласса А
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
//суперкласс можно использовать самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        // superOb.k = 10; k подкласса не видна в суперклассе
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();
        System.out.println();

        /* Подкласс имеет доступ ко всем открытым члекам своего суперкласса*/
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        // subOb.x = 10; privet переменная суперкласса А не видна в подклассе B. х доступна только внутри класса А
        System.out.println("Содержимое объекта subOb");
        subOb.sum();

        System.out.println("i super: " + superOb.i + "  i sub: " + subOb.i);
        //значения переменной i у каждого класса различны
    }
}