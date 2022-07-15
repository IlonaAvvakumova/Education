package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<>();
        LL.add("F");
        LL.add("B");
        LL.add("D");
        LL.add("E");
        LL.add("C");
        LL.addLast("Z");
        LL.addFirst("A");
        LL.add(1, "A2");
        System.out.println("Исходное содержимое связного списка LL: " + LL);
        LL.remove("F");
        LL.remove(2);
        System.out.println("Содержимое связного списка LL после удаления элементов: " + LL);
        //удалить первый и последний элемент
        LL.removeFirst();
        LL.removeLast();
        System.out.println("Содержимое связного списка LL после удаления первого и последнего элементов: " + LL);

        String val = LL.get(2);
        LL.set(2,val+" изменено");

        System.out.println("Содержимое связного списка LL после изменения: " + LL);

    }
}
