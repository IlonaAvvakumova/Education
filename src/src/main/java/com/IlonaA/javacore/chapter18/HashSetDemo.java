package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");

        System.out.println(lhs);
    }
}
class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        ts.add("K");
        ts.add("O");

        System.out.println(ts);

        TreeSet<String> ts2 = (TreeSet<String>) ts.subSet("C","O"); //это не новый объект а представление основного трисета
        System.out.println(ts2);
        ts.add("M");
        System.out.println(ts2);
    }
}