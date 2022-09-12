package src.main.java.com.IlonaA.javacore.Patterns.Memento;

public class Memento {
    private final String age;

    public Memento(String age) {
        this.age = age;
    }
    public String getState(){
        return age;
    }
}
