package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.CherryCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Hospital;

public class CherryHospital implements Hospital {
    CherryHospital() {
        System.out.println("Создана Больница г.Вишня");
    }

    @Override
    public void heal() {
        System.out.println("В городе Вишня работает больница");
    }
}
