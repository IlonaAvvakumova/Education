package src.main.java.com.IlonaA.javacore.Patterns.Composite;

public class Story implements Library{


    @Override
    public void print() {
        System.out.println("Добавлены рассказы");
    }

    @Override
    public String toString() {
        return "Story{}";
    }
}
