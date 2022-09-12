package src.main.java.com.IlonaA.javacore.Patterns.Visitor;

public class Save implements Visitor{
    @Override
    public void action(Cook cook) {
        System.out.println("кормит людей");
    }

    @Override
    public void action(Policeman policeman) {
        System.out.println("ловит преступников");
    }

    @Override
    public void action(Doctor doctor) {
        System.out.println("лечит людей");
    }
}
