package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {
        //создать хеш-отображение
      HashMap<String, Double> hm = new HashMap<>();
        //ввести элементы в хеш-отображение

        hm.put("Джон Доу", 3434.34);
        hm.put("Том Смит", 123.22);
        hm.put("Джейн Бейкер", 1378.00);
        hm.put("Тод Холл", 99.22);
        hm.put("Ральф Смит", -19.08);

//получить множество записей
        /*Set<Map.Entry<String,Double>> set = hm.entrySet();
        //вывести множество записей
        for (Map.Entry me : set
             ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }*/
        //можно вывести следующим образом:
        for (Map.Entry me : hm.entrySet() //получаем сразу вывод ключа и значения  entrySet() содержит и ключ и значение в себе
        ) {
            System.out.print(me.getKey()+": ");
            System.out.println(me.getValue());
        }
   /*     System.out.println("-----------------------------------------");// вариация вывода
        for (String e:hm.keySet() //  keySet() содержит только ключ
             ) {
            System.out.println( e + " "+ hm.get(e));
        }*/
        System.out.println();
        //внести сумму 1000 на счет Джона Доу
        double balance = hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + hm.get("Джон Доу"));
    }
}
