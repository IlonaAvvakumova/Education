package src.main.java.com.IlonaA.javacore.chapter15;
//Продемонстрировать применение ссылки на конструтор
//В функциональном интерфейсе MyFunc4  определяется метод возвращающий ссылку на класс MyClass
interface MyFunc4{
    MyClass2 func(int n);
}
class MyClass2{
    private int val;
    //Этот конктруктор принимает один аргумент
    MyClass2(int v) { val = v;}
    //А это конструктор по умолчанию
    MyClass2() { val = 0;}
    //...
    int getVal() {return val;}
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        //Создать ссылку на констрктор класса   MyClass2
        //Метод func() из интерфейса MyFunc4 принимает аргумент, поэтому оператор new обращается к параметризированному конструктору
        //класса MyClass2, а не к его констрктору по умолчанию
        MyFunc4 myClassCons = MyClass2 ::new;

        //создать экземпляр класса MyClass2 по ссылке на его конструктор
        MyClass2 mc = myClassCons.func(100);

        //использовать только что созданный экземпляр класса MyClass2
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
    }
}
