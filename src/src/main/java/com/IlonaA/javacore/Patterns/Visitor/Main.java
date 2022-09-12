package src.main.java.com.IlonaA.javacore.Patterns.Visitor;

public class Main {
    public static void main(String[] args) {
        Common doctor = new Doctor();
        Common policeman = new Policeman();
        Common cook = new Cook();

        doctor.accept(new Save());
        doctor.accept(new Activity());
    }
}