package src.main.java.com.IlonaA.javacore.Patterns.Mediator;

public class Main {
    public static void main(String[] args) {
Pochtamp pochta = new Pochtamp();
Human human1 = new Somebody("Kolya", pochta);
Human human2 = new Somebody("Nastya", pochta);
Human human3 = new Somebody("Vova", pochta);

pochta.addPeople(human1);
pochta.addPeople(human2);
pochta.addPeople(human3);

human1.send("С Новым Годом!");

    }
}
