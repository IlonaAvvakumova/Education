package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.CherryCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Administration;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.City;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Hospital;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.School;

public class CherryCity implements City {

  public   CherryCity(){
        System.out.println("Город Вишня строит:");
    }
    @Override
    public Administration getAdmin() {
        return new CherryAdministration();
    }

    @Override
    public Hospital getHosp() {
        return new CherryHospital();
    }

    @Override
    public School getSch() {
        return new CherrySchool();
    }
}
