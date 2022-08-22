package src.main.java.com.IlonaA.javacore.chapter29;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        int [] array = {1,10,8,63,45,2};
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Iterator<String> itr = myList.stream().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
//вывести Iterator примитивного типа данных
      PrimitiveIterator array1 = Arrays.stream(array).filter(n->n%2==0).iterator();
        while (array1.hasNext())
            System.out.print(array1.next()+" ");
        System.out.println("---------------------");
    int [] array2= Arrays.stream(array).filter(n->n%2==0).toArray();
        for (int a:array2
             ) {
            System.out.print("Array: " + a);
        }
    //    int [] array3= Arrays.stream(array).filter(n->n%2==0).forEach(n-> System.out.println(n));

}}
class StreamDemo9{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        int [] array = {1,10,8,63,45,2};
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
//получить итератор-разделитель
        Spliterator<String> splitItr = myStream.spliterator();
//перебрать элементы в потоке данных
        while (splitItr.tryAdvance(n-> System.out.println(n)));
        //метод tryAdvance возвращает логическое значение false если больше нет элементов для обработки

    }
}
class StreamDemo10{
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        int [] array = {1,10,8,63,45,2};
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        //получить поток данных для списочного массива
        Stream<String> myStream = myList.stream();
//получить итератор-разделитель
        Spliterator<String> splitItr = myStream.spliterator();
//а теперь разделить первый итератор
        Spliterator<String> splitItr2 = splitItr.trySplit();
        //использовать сначала итератор splitItr2  если нельзя разделить итератор splitItr
       if (splitItr2 != null){
        System.out.println("Результат выводимый итератором splitIntr2" );
       splitItr2.forEachRemaining(n-> System.out.println(n));}//вывод каждого элемента без написания цикла

        //а теперь воспользоваться итератором splitItr
        System.out.println("\nРезультат выводимый итератором splitItr" );
        splitItr.forEachRemaining(n-> System.out.println(n));
    }
}