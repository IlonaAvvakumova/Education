package src.main.java.com.IlonaA.javacore;

import java.util.Collection;

public class test2 {
    public static void main(String[] args) {
        A aa = new B();
        aa.abc();
        System.out.println(aa.a);


    }}
class A {
    int a = 10;
    void  abc(){
        System.out.println("A");
    }
}
class B extends A{
    int a = 20;
   void abc(){
       System.out.println("B");
   }
}