package src.main.java.com.IlonaA.javacore.chapter15;
//продемонитрировать применение ссылки на метод экземпляра
//Функциональный интерфейс для операвии с символьными строками
interface StringFf{
    String func(String n);
}
//Теперь в этом классе определяется метод экземпляра strReverse()
public class MyStringOps2 {
    String strReverse(String str){
        String result = "";
        int i;
        for (i=str.length()-1;i>=0;i--)
            result+=str.charAt(i);
        return result;
    }
}
class MethodRefDemo2{
    //В этом методе функциональный интерфейс указывается в качестве типа первого его параметра.
    //Следовательно ему может быть перадан любой экземпляр этого интерфейса включая и ссылку на метод
    static String stringOp (StringFf sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда выражения повышают эффективность  Java";
        String outStr;
        //создать объект типа
        MyStringOps2 strOps = new MyStringOps2();
        //А теперь ссылка на метод экземпляра strReverse() передается методу stringOp()
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
class B{
   Integer def (){//здесь не явно вызывается в скобках (B this)
       return 5;
   }
}
interface Ib{
    Integer test(B b);
}
class A{
    String abc(String s){
        return s;
    }

    public static void main(String[] args) {
         //ссылка на метод определенного класса
         A aaa = new A();
       StringFf c = aaa::abc; // ссылка на метод класса А присваивается интерфейсу, теперь метод интерфейса работает как метод abc
        System.out.println(c.func("Hello"));
        //Лямбда
        StringFf b = s-> {  // в переменную типа интерфейса записывается как должен работать метод через лямбда выражение
            System.out.println(s);
            return s;
        };
        b.func("bye"); // вызывается метод интерфейса
//Ссылка на статический метод, нужно что бы abc был static
     //   StringFf e = A::abc;
      //  System.out.println(e.func("Ok"));

        //Ссылка на метод с любым объектом класса
        Ib d = B :: def;
B i = new B();
d.test(i);
    }
}
