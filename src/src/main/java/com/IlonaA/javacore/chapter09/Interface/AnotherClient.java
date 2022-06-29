package src.main.java.com.IlonaA.javacore.chapter09.Interface;
interface Callback{
    void callback(int param);
}
abstract class Incomplete implements Callback{
    int a,b;
    void show(){
        System.out.println(a+" "+b);
    }
    //класс не реализует метод интерфейса, поэтому должен быть абстрактным. Класс наследующий от Incomplete
    //должен будет реализовать метод интерфейса или так же стать абстрактным
}
class Client implements Callback{
    public void callback(int p){
        System.out.println("Метод  callback() вызываемый со значением " + p);
    }
    void nonIfaceMeth(){
        System.out.println("В классах реализующих интерфейсы," + "могут определяться и другие члены");
    }
}

public class AnotherClient implements Callback {
    //реализовать интерфейс Callback
    public void callback(int p){
        System.out.println("Еще один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
class TestIface2{
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(52);
        c= ob;
        c.callback(52); //вариант метода выбирается в зависимости от типа объекта
    }
}
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client(); //переменная с не предоставляет доступ к другим членам Client, кроме метода интерфейса
        c.callback(42);

    }
}