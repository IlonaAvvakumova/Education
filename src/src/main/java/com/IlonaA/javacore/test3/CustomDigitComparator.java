package src.main.java.com.IlonaA.javacore.test3;

import java.util.Comparator;

//Написать компаратор CustomDigitComparator, который реализует интерфейс Comparator<Integer>.
//        Класс CustomDigitComparator определяет следующий порядок:
//
//        Сначала четные числа, затем нечетные
//        На вход подаются числа, отличные от null
//        Реализовать класс Person{name, city, age}, определить метод toString
//        Класс Person реализует интерфейс Comparable<Person>, который обеспечивает следующий порядок:
//
//        Сортировка сначала по полю city, а затем по полю name
//        Поля name, city отличны от null
//        ###Критерии приемки
//
//        Предоставить Pull Request из ветки feature/CustomDigitСomparator
//        Предоставить Pull Request из ветки feature/PersonCompariCustomDigitСomparatorng
public class CustomDigitComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
     if((o1%2==0)){
         return -1;
     }else if (o1==o2){
         return 0;
     }else {
         return 1;
     }

    }
}
