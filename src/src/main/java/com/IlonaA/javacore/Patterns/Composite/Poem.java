package src.main.java.com.IlonaA.javacore.Patterns.Composite;

public class Poem implements Library{

    @Override
    public void print() {
        System.out.println("Добавлена поема");
    }

    @Override
    public String toString() {
        return "Poem{}";
    }
}
