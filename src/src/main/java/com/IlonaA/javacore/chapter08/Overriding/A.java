package src.main.java.com.IlonaA.javacore.chapter08.Overriding;

public class A {
    int i,j;
    A(int a, int b){
        i = a;
        j = b;
    }
    void show(){
        System.out.println("i и j: " + i + " " +j);
    }
    void metodSwowA(){
        System.out.println(" Это метод А класса и выводит его переменные " + i + " " + j);
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k=c;
    }
    //вывести содержимое переменной k с помощью метода переопределяющего метод show() из класса А
    void show(){
        System.out.println("k: " + k); // переопределенный метод
    }
    void show(String s){
        System.out.println(s + k); // перезагруженный метод
    }
    void metodSwowA(){
        super.metodSwowA(); //вызов метода из А класса
     //   System.out.println("k:" + k);
    }
}
class Override{
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();
        subOb.show("Hello ");
        subOb.metodSwowA();
    }
}