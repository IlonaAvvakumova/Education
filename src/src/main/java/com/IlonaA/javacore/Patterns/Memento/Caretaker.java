package src.main.java.com.IlonaA.javacore.Patterns.Memento;

public class Caretaker {
    private Memento memento;
    Memento getMemento(){
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
