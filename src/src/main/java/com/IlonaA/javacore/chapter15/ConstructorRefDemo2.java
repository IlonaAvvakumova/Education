package src.main.java.com.IlonaA.javacore.chapter15;


//Продемонстрировать применение ссылки на конструтор
//В функциональном интерфейсе MyFunc5  определяется метод возвращающий ссылку на класс MyClass3
interface MyFunc5<T>{
    MyClass3<T> func(T n);
}
class MyClass3<T>{
    private T val;
    //Этот конктруктор принимает один аргумент
    MyClass3(T v) { val = v;}
    //А это конструктор по умолчанию
    MyClass3() { val = null;}
    //...
    T getVal() {return val;}
}
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        //Создать ссылку на консструктор обобщенного класса MyCLass3<T>
        MyFunc5<Integer> myClassCons = MyClass3<Integer> ::new;

        //создать экземпляр класса MyClass3<T> по данной ссылке на конструктор
        MyClass3<Integer> mc = myClassCons.func(100);

        //воспользоваться только что созданным экземпляром класса MyClass3<T>
        System.out.println("Значение val в объекте  mc равно " + mc.getVal());
    }
}