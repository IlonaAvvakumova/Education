package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.CherryCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Administration;

public class CherryAdministration implements Administration {

    CherryAdministration(){
        System.out.println("Создана Администрация г.Вишня");
    }
    @Override
    public void control() {
        System.out.println("Город Вишня контролирует администрация");
    }
}
