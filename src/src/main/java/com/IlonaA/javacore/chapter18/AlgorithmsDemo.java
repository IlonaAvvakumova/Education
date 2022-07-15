package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> LL = new LinkedList<>();
        LL.add(-8);
        LL.add(20);
        LL.add(-20);
        LL.add(8);

        //создать компоратор с обратным упорядочиванием

        System.out.print(LL);
        Comparator<Integer> r = Collections.reverseOrder();
        //отсортировать список с помощью этого компоратора
        Collections.sort(LL, r);
        System.out.println("Список отсортирован в обратном порядке");

        for (int i : LL)
            System.out.print(i + " ");
        System.out.println();

        //перетасовать список
        Collections.shuffle(LL);
        System.out.println("Список перетасован: ");

        for (int i : LL)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Максимум: " + Collections.max(LL));
        System.out.println("Минимум: " + Collections.min(LL));
    }
}
