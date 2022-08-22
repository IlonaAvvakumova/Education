package src.main.java.com.IlonaA.javacore.Case.module_1;
/*Дан массив целых чисел. Необходимо реализовать метод, который возвращает
 индексы массива, значения которых в сумме дают число переданное в массив.

        Предполагается, что массив содержит только уникальные числа и всегда имеет искомые числа.
        Один и тот же элемент не может быть использован дважды.

        array = [3, 8, 15, 17], Number = 23
        result = [1,2]

        Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23*/

import java.util.*;

public class caseOne {

    public static void main(String[] args) {
        int array[] = {3, 8, 15, 17};
        //search(array, 23);
        int[] array2 = search(array, 23);
        for (int a:array2
             ) {
            System.out.print(a + " ");
        }
    }

    static int[] search(int[] array, int number) {
        HashMap<Integer, Integer> result = new HashMap();
        for (int i = 0; i < array.length-1; i++) {
            result.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
int required = number - array[i];
if(result.containsKey(required)&& result.get(required) !=i){
    return new int[] {i, result.get(required)};}  // String value = get(key);

        }
      /*  for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == number){
                    result.put(i, array[i]);
                }
            }*/
throw new  IllegalArgumentException("jdfnjghg");
    }


    }



 /*   ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
        if (array[i] + array[j] == number)
        result.add(i);
        }
        }
        System.out.println(result);*/