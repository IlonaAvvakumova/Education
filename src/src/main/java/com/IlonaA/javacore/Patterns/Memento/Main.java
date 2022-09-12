package src.main.java.com.IlonaA.javacore.Patterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Memento> list = new ArrayList<>();
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setAgeNew("young");
        list.add(originator.saveState()); //сохраняем состояния в лист
        System.out.println("Состояние " + originator.getAgeNew());
        caretaker.setMemento(originator.saveState());

        originator.setAgeNew("adult");
        list.add(originator.saveState());
        System.out.println("Новое состояние1 " + originator.getAgeNew());
        caretaker.setMemento(originator.saveState());

        originator.setAgeNew("old");

        System.out.println("Новое состояние2 " + originator.getAgeNew());

        originator.restoreState(list.get(1)); // вызываем разные состояния с помощью индекса
        System.out.println("Старое состояние " + originator.getAgeNew());

    }
}
