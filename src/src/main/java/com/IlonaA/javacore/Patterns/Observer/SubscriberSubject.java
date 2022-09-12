package src.main.java.com.IlonaA.javacore.Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriberSubject implements Subject{

    List<Observer> observerList = new ArrayList<>();
    @Override
    public void addSubscriber(Observer observer) {
observerList.add(observer);
    }

    @Override
    public void deleteSubscriber(Observer observer) {
observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(String msg) {
        for (Observer ob: observerList
             ) {
            ob.call(msg);
        }
    }
}
