package src.main.java.com.IlonaA.javacore.Patterns.Observer;

public interface Subject {
    void addSubscriber(Observer observer);
    void deleteSubscriber(Observer observer);
    void notifySubscribers(String m);
}
