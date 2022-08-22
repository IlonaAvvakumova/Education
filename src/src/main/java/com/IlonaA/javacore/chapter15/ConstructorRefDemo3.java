package src.main.java.com.IlonaA.javacore.chapter15;
//реализовать простую фабрику классов, используя ссылку на конструктор
interface MyFunc6<R,T>{
    R func(T n);
}
//Простой обобщенный класс
class MyClass4<T>{
    private T val;
    //Конструктор принимающий один параметр
    MyClass4(T v) {val = v;}
    //Конструтор по умолчанию. Этот конструктор в данной программе НЕ используется
    MyClass4() {val = null;}
    //...
    T getVal(){return  val;}
}
//простой необобщенный класс
class MyClass5{
    String str;
    //Конструктор принимающий один аргумент
    MyClass5(String s) {str = s;}
    //Конструктор по умолчанию. Этот конструктор в данной программе НЕ используется
    MyClass5() {str = "";}
    //...
    String getVal(){return str;}
}
public class ConstructorRefDemo3 {
    //Фабричный метод для объектов разных классов. У каждого класса должен быть свой конструктор, принимающий один параметр типа Т.
    //А параметр R обозначает тип создаваемого объекта
    static <R,T> R myClassFactory(MyFunc6<R,T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        //Создать ссылку на конструктор класса MyClass4
        //В данном случае оператор new обращается к конструктору принимающему аргумент
        MyFunc6<MyClass4<Double>, Double> myClassCons = MyClass4<Double> ::new;
        //создать экземпляр типа класса MyClass4  используя фабричный мето
        MyClass4<Double> mc = myClassFactory(myClassCons,100.1);
        //использовать только что созданный экземпляр класса MyClass4
        System.out.println("Значение val в объекте mc равно " + mc.getVal());
        //А теперь создать экземпляр другого класса используя метод myClassFactory()
        MyFunc6<MyClass5,String> myClassCons2 = MyClass5::new;

        //создать экземпляр класса MyClass4 использу фабричный мето
        MyClass5 mc2 = myClassFactory(myClassCons2,"Лямбда");
        //использовать только что созданный экземпляр класса MyClass4
        System.out.println("Значение str в объекте mc2 равно" + mc2.getVal());
    }
}
