package src.main.java.com.IlonaA.javacore.chapter08.Abstract;


    abstract class A{
        abstract void callme();
        void callmetoo(){
            System.out.println("Это кокретный метод");
        }
    }
class B extends A{
        void callme(){
            System.out.println("Реализация метода callme() из класса В");
        }
}
class AbstractDemo{
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}