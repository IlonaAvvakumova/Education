package src.main.java.com.IlonaA.javacore.Case.module_1;
/*Дан массив целых чисел.
        Необходимо реализовать метод, которые определяет, содержит ли данный массив дубликаты

        Пример:
        Array: [4,5,6,6,8]
        Result: true
        Число 6 повторяется 2 раза

        Array: [4,5,6,7,8]
        Result: false
        Дубликатов нет*/


import java.util.ArrayList;

public class caseTwo {
    public static void main(String[] args) {
        int array[] = {4, 5, 6, 8, 7, 7};

        System.out.println(dubl(array));
    }

    static boolean dubl(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1])
                return true;
        }
        return false;

    }
}

