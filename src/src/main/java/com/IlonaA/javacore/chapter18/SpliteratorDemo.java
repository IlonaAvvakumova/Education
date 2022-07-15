package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // вызвать метод tryAdvance()  для вывода содержимого списочного массива vals
        System.out.println("Содержимое списочного массива vals:\n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        //создать новый списочный массив, содержащий квадратные корни числовых значений из vals

        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n)->sqrs.add(Math.sqrt(n))));

        // вызвать метод forEachRemaining() для вывода содержимого sqrs

        System.out.println("Содержимое массива srqs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n)-> System.out.println(n));
        System.out.println();
    }
}
