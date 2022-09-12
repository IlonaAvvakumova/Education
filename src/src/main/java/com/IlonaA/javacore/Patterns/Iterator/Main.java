package src.main.java.com.IlonaA.javacore.Patterns.Iterator;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        Sommelier somel = new Sommelier();
        somel.wines = Arrays.asList("Шампанское", "Красное вино", "Белое вино", "Вино в пакете - \n\"Какая гадость\" - говорит сомелье");

        Iterator iterator = somel.getIterator();
        System.out.println("Сомелье пробует вино из коллекции: ");
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}
