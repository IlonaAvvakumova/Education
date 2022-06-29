package src.main.java.com.IlonaA.javacore.chapter09.Interface;

public interface parentInt {//родительский интерфейс
    void meth1();
    void meth2();
}

interface childInt extends parentInt{
    void meth3();
}
class MyClass implements childInt{ //класс должен реализавать методы родителя и дитя-интерфейсов
    public void meth1(){
        System.out.println("реализация метода meth1(): ");
    }
    public void meth2(){
        System.out.println("реализация метода meth2(): ");
    }
    public void meth3(){
        System.out.println("реализация метода meth3(): ");
    }

    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}