package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.PeachCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.School;

public class PeachSchool implements School {
    PeachSchool(){
        System.out.println("Создана школа в г.Персик");
    }
    @Override
    public void learn() {
        System.out.println("Открыта школа в городе Персик");
    }
}
