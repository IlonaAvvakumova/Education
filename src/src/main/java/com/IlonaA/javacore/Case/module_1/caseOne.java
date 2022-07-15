package src.main.java.com.IlonaA.javacore.Case.module_1;
/*Дан массив целых чисел. Необходимо реализовать метод, который возвращает
 индексы массива, значения которых в сумме дают число переданное в массив.

        Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
        Один и тот же элемент не может быть использован дважды.

        array = [3, 8, 15, 17], Number = 23
        result = [1,2]

        Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class caseOne {
    public static void main(String[] args) {
        int array[] = {3, 8, 15, 17};
        search(array, 23);
    }

    static void search(int array[], int number) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == number)
                    result.add(i);
            }
        }
        System.out.println(result);
    }
}
