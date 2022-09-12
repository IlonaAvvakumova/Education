package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.CherryCity.CherryCity;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.PeachCity.PeachCity;
/*Продемонстрировать работу паттерна Абстрактная фабрика, на примере использования разных фабрик-городов для создания зданий*/

public class Main {
    public static void main(String[] args) {
        City peach = new PeachCity();
        Administration peachAdministration = peach.getAdmin();
        Hospital peachHospital = peach.getHosp();
        School peachSchool = peach.getSch();
        peachAdministration.control();
        peachSchool.learn();
        peachHospital.heal();
        System.out.println("---------------------------------------------------");
        City cherry = new CherryCity();
        Administration cherryAdministration = cherry.getAdmin();
        Hospital cherryHospital = cherry.getHosp();
        School cherrySchool = cherry.getSch();
        cherryAdministration.control();
        cherrySchool.learn();
        cherryHospital.heal();

    }
}
