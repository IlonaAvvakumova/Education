package src.main.java.com.IlonaA.javacore.Patterns.Memento;

public class Originator {
    private String ageNew;

    public String getAgeNew() {
        return ageNew;
    }

    public void setAgeNew(String ageNew) {
        this.ageNew = ageNew;
    }
    public Memento saveState() {
        return new Memento(ageNew);
    }

    public void restoreState(Memento memento) {
        this.ageNew = memento.getState();
    }

}
