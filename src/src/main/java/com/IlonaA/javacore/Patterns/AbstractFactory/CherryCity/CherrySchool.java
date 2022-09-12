package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.CherryCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.School;

public class CherrySchool implements School {
    CherrySchool(){
        System.out.println("Создана Школа г.Вишня");
    }
    @Override
    public void learn() {
        System.out.println("Открыта школа в городе Вишня");
    }
}
