package src.main.java.com.IlonaA.javacore.Case.module_1;

import java.util.Iterator;
import java.util.LinkedList;

public class test2 {
    public static void main(String[] args) {
        LinkedList<Integer> t = new LinkedList();
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
//itco
        for (Iterator<Integer> iterator = t.iterator(); iterator.hasNext(); ) {
            Integer next =  iterator.next();
            System.out.print(next + " ");
            
        }
    }
}
