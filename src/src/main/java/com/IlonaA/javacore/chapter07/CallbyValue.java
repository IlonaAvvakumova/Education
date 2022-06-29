package src.main.java.com.IlonaA.javacore.chapter07;

public class CallbyValue {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a=15,b=20;
        System.out.println("a и b до вызова: " + a + " " +b);
        ob.meth(a,b);
        System.out.println("a и b после вызова: " + a + " " +b); // a и b не изменяются после вызова метода,
        //т.к. в метод передаются примитивные типы данных

    }
}
class Test1{
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
}
