package src.main.java.com.IlonaA.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

       Stream<Double> sqrtRootStrm = myList.stream().map(a->Math.sqrt(a));

        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a,b)->a*b);
     //   Double sqrtRootStrm = myList.stream().map(a->Math.sqrt(a)).reduce(1.0, (a,b)->a*b); другой метод написания
        System.out.println("произведение квадратных корней:  " + productOfSqrRoots);
    }
}
