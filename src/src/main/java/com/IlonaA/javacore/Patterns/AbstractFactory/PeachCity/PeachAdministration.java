package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.PeachCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Administration;

public class PeachAdministration implements Administration {
    PeachAdministration(){
        System.out.println("Создана Администрация г.Персик");
    }
    @Override
    public void control() {
        System.out.println("Город Персик контролирует администрация");
    }
}
