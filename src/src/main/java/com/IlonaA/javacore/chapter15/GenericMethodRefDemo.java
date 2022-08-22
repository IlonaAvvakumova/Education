package src.main.java.com.IlonaA.javacore.chapter15;
//Продемонстрировать применение ссылки на обобщенный метод объвяленный в необобщенном класса
//Функциональный интерфейс для обработки массива значений и возврата целочисленного результата
interface MyFunc3<T>{
    int func(T[] vals, T v);
}
//В этом классе определяется метод countMatching()  возвращающий количество элементов в массиве равных указанному значению
//Обратите внимание на то что метод countMatching()  является обобщенным тогда как класс MyArrayOps  - необобщенным

class MyArrayOps{
    static <T> int countMatching (T[] vals, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count ++;
        }
        return count;
    }
}
public class GenericMethodRefDemo {
    //В качестве первого параметра этого метода указывается функциональный интерфейс  MyFunc3
    //а в качестве двух других параметров - массив и значение причем оба типа Т
    static <T>  int myOp(MyFunc3<T> f, T[] vals, T v){
        return f.func(vals,v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"Один", "Два","Три","Два"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals,4);
        System.out.println("Массив vals содержит "+ count + " числа 4");

        count = myOp(MyArrayOps::countMatching, strs,"Два");
        System.out.println("Массив strs содержит "+ count + " числа два");
    }
}
