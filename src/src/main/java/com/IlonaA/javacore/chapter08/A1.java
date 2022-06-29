package src.main.java.com.IlonaA.javacore.chapter08;

public class A1 {
    A1(){
        System.out.println("B в конструкторе А1");
    }
}
class B1 extends A1{
    B1(){
        System.out.println("B в конструкторе B1");
    }
}
class C extends B1{
    C(){
        System.out.println("B в конструкторе C");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C c = new C();
    }
}
