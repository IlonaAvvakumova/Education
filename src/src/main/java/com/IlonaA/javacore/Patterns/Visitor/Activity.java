package src.main.java.com.IlonaA.javacore.Patterns.Visitor;

public class Activity implements Visitor{
    @Override
    public void action(Cook cook) {
        System.out.println("выпекает хлеб");
    }

    @Override
    public void action(Policeman policeman) {
        System.out.println("дежурит по ночам");
    }

    @Override
    public void action(Doctor doctor) {
        System.out.println("выписывает рецепт");
    }
}
