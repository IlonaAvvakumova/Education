package src.main.java.com.IlonaA.javacore;

public class Test {
    public static void main(String[] args) {
//A test1 = new D();
     //  ((D)test1).ccc(); //метода ссс нет в типе А, но после casting метод становится виден для пер test1
     /*   B test2 = new C();
        test2.xyz(5,"G");*/
       C test3 = new D();
        System.out.println(test3.getClass());
        System.out.println(test3.toString());
     //   test3.a_i = 12; не получится т.к. в интерфейсе все поля final
      //  ((D)test3).ddd();
       // test3.def();
       // test3.aaa(); // метод ааа не является оверлодед методом интерфеса А
       // A.aaa(); // можно напрямую вызывать статический метод интерфейса
       /* Сравни мне две строки, пожалуйста:
        "Some test String"
        "Another String"*/
        String a = "Some test String";
        String b =  "Another String";

                System.out.println(a.equals(b) + a==b);
    }
}
interface A{
    int a_i = 5;
    void abc();
    default void def(){
        System.out.println("Дефолтный метод интерфейса А");
    }
     static void aaa(){
        System.out.println("Статический метод интерфейса А"); //не может быть overloaded or overroded
    }
}
abstract class B{
    int b_a= 10;
 abstract void xyz(int a, String b);
   void klm(){
     System.out.println("Это конкретный метод обстрактного класса В");
 }
}
 class C extends B implements A{
    int c;

    //методы интефейса
    public void abc(){ // обязательно делать его public!!!
        System.out.println("Это оверайдинг метод интерфейса А в классе С");
        A.aaa(); // вызов статического метода из интерфейса
    }
  public void def(){ // обязательно делать его public!!!
    System.out.println("Могу перезапистаь дефолтный метод интерфейса");

}
     @Override // методы абстрактного класса
     void xyz(int a, String b) {
         c=a;
         System.out.println("Перезаписанный абстрактный метод класса В в классе С" + b);
     }
     void klm(){

     }
     //свой метод
     void ccc(){
         System.out.println("Собственный метод класса С");
     }


 }
 class D extends C{
    int d = 20;
    void ddd(){
        System.out.println("Метод D");
    }

 }

 class T {

  void  ttt(){
         System.out.println("метод Т");
     }
 }
 class F extends T{

    void  ttt(int i){
         System.out.println("метод F");
     }
 }
/*   Добавьте код в тело метода sayHello(),
  который вызывает метод printHello() (при необходимости расширьте код класса B)*/
interface A1 {

    static void printHello(){
        System.out.println("Hello");
    }
}

class B1 implements A1{
    void sayHello(){
A1.printHello();
    }
}