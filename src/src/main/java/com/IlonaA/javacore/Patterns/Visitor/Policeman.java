package src.main.java.com.IlonaA.javacore.Patterns.Visitor;

public class Policeman implements Common {
    @Override
    public void accept(Visitor visitor) {
        visitor.action(this);
    }
}
