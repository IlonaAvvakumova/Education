package src.main.java.com.IlonaA.javacore.chapter09.Interface;
//это класс который содержит интерфейс как свой член
public class A {
    //вложенный интерфейс
    public interface NestedIF{
        boolean isNotNegative(int x);
    }
}
//класс В реализует влоежнный интерфейс
class B implements A.NestedIF{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
class NestedIFDemo{
    public static void main(String[] args) {
        //использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();
        System.out.println(nif.isNotNegative(5));
        if(nif.isNotNegative(10))
            System.out.println("Число 10 отрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}