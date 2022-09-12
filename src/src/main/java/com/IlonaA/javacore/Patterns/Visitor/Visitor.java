package src.main.java.com.IlonaA.javacore.Patterns.Visitor;

public interface Visitor {
 void action(Cook cook);
 void action(Policeman policeman);
 void action(Doctor doctor);
}
