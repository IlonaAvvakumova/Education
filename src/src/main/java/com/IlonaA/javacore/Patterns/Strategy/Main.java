package src.main.java.com.IlonaA.javacore.Patterns.Strategy;

import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.TypeSing1;
import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.TypeSing2;
import src.main.java.com.IlonaA.javacore.Patterns.Strategy.ForStrategy.TypeSing3;

public class Main {
    public static void main(String[] args) {
        WhatDo singer1 = new Singer1(new TypeSing1());
        System.out.println("Первый артист");
        singer1.perform();
        singer1.singer();
        singer1.biss();
        WhatDo singer2 = new Singer2(new TypeSing2());
        System.out.println("Второй артист");
        singer2.perform();
        singer2.singer();
        singer2.biss();
        WhatDo singer3 = new Singer3(new TypeSing3());
        System.out.println("Третий артист");
        singer3.perform();
        singer3.singer();
        singer3.biss();

    }
}
