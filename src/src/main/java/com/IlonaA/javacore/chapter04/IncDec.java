package src.main.java.com.IlonaA.javacore.chapter04;

public class IncDec {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int d;
        c = ++b; // с начала изменяем b а потом результат присваиваем c
        d = a++; // с начала присваиваем значение а для d, а потом увеличиваем а
        c++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
