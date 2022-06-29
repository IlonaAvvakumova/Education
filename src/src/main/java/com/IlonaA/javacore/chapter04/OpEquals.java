package src.main.java.com.IlonaA.javacore.chapter04;

public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a+=5;
        b*=4;
        c+=a*b;
        c%=6;
        System.out.println("a =" + a); //6
        System.out.println("b =" + b);//8
        System.out.println("c =" + c); //3
    }
}
