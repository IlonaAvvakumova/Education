package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComp implements Comparator<String > {
    @Override
    public int compare(String a, String b) { //компаратор для сравнения символьных строк в обратном порядке
        String aStr, bStr;
        aStr = a;
        bStr = b;
        //выполнить сравнение в обратном порядке
       // return bStr.compareTo(aStr);
        return aStr.compareTo(bStr);
    }
    //переопределять equals не требуется
}
class CompDemo{
    public static void main(String[] args) {
        //TreeSet<String > ts = new TreeSet<>(new MyComp());
        TreeSet<String > ts = new TreeSet<>(new MyComp().reversed()); //метод обратного упорядочивания с Java 8
        //ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        //вывести элементы
        for (String a:ts
             ) {
            System.out.print(a + " ");
        }
        System.out.println();

    }
}
class CompDemo2{
    public static void main(String[] args) {
        //метод написания компоратора сразу в строке с помощью лямба выражения. Создавать отдельно Компоратор не нужно
        TreeSet<String > ts2 = new TreeSet<>(
                (aaStr, bbStr)-> bbStr.compareTo(aaStr));

        ts2.add("C");
        ts2.add("A");
        ts2.add("B");
        ts2.add("E");
        ts2.add("F");
        ts2.add("D");

        //вывести элементы
        for (String a:ts2
        ) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
