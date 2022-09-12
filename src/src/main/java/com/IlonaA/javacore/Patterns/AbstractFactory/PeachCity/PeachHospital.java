package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.PeachCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Hospital;

public class PeachHospital implements Hospital {
    PeachHospital(){
        System.out.println("Создана Больница г.Персик");
    }
    @Override
    public void heal() {
        System.out.println("В городе Персик работает больница");
    }
}
