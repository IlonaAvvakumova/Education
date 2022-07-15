package src.main.java.com.IlonaA.javacore.Case.module_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        int array[] = {8,4,5,6,6,8,6,4,8,8};

        dubl(array);
    }

    static void dubl(int array[]) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int a : array //дублируем элементы массива в коллекцию
        ) {
            newArray.add(a);
        }
        for (int i = 0; i < array.length; i++) { // заполняем result значениями дубликатов
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    if (!result.contains(array[i]))
                        result.add(array[i]);
            }
        }
        //проверяем на дубликаты, если они есть перебираем result и ищем уникальное количество вхождений с помощью frequency
        if (result.isEmpty()) System.out.println("Дубликатов нет");
        else
            for (int i = 0; i < result.size(); i++) {
                int count = Collections.frequency(newArray, result.get(i));
                System.out.println("Число " + result.get(i) + " повторяется " + " " + count + " раза.");
            }
    }
}
