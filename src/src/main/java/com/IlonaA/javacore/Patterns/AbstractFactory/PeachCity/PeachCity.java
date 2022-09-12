package src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.PeachCity;

import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Administration;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.City;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.Hospital;
import src.main.java.com.IlonaA.javacore.Patterns.AbstractFactory.School;

public class PeachCity implements City {
    public PeachCity(){
        System.out.println("город Персик строит:");
    }
    @Override
    public Administration getAdmin() {
        return new PeachAdministration();
    }

    @Override
    public Hospital getHosp() {
        return new PeachHospital();
    }

    @Override
    public School getSch() {
        return new PeachSchool();
    }
}
