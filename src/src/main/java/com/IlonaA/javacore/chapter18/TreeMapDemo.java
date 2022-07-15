package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String , Double> tm = new TreeMap<>();
        tm.put("Джон Доу", 3434.34);
        tm.put("Том Смит", 123.22);
        tm.put("Джейн Бейкер", 1378.00);
        tm.put("Тод Холл", 99.22);
        tm.put("Ральф Смит", -19.08);

        for (Map.Entry me : tm.entrySet() //получаем сразу вывод ключа и значения  entrySet() содержит и ключ и значение в себе
        ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        //внести сумму 1000 на счет Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + tm.get("Джон Доу"));
    }
}
