package src.main.java.com.IlonaA.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        //создать список объектов типа Integer
        List<Integer> myList = List.of(7,18,10,24,17,5);
      /*  Integer myList2 = 23;*/
        //Два способа получения результата перемножения целочисленных элементов списка myList с помощью метода reduce()
        Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
        if (productObj.isPresent()) System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());
        /*Integer result = productObj.orElse(myList2);
        System.out.println("moy list" + result);*/
        int product = myList.stream().reduce(1,(a,b) -> a*b);// уже не получим null даже если в значениях будет пусто
        //или int product = myList.stream().reduce((a,b) -> a*b).get();

        System.out.println("Произведение в виде объекта типа int: " + product);

    }
}
