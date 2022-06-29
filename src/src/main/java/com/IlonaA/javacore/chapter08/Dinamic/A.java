package src.main.java.com.IlonaA.javacore.chapter08.Dinamic;
//Динамическая типизация методов
public class A {
    int i = 5;
    void callme(){
        System.out.println("В методе callme() из класса А");
    }
}
class B extends A{
    int j = 10;
    ////переопределяем метод callme()
    void callme(){ // если метод не переопределить, будет использоваться метод А класса
        System.out.println("В методе callme() из класса B");
    }
}
class C extends A{
    int k = 25;
    //переопределяем метод callme()
    void callme(){
        System.out.println("В методе callme() из класса C");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; // получить ссылку на объект типа А

        r = a; // переменная r ссылается на объект типа А, вызывается метод класса А
        r.callme();

        r = b; // переменная r ссылается на объект типа В, вызывается метод класса В
        r.callme();

        r=c; // переменная r ссылается на объект типа С, вызывается метод класса С
        r.callme();



    }
}