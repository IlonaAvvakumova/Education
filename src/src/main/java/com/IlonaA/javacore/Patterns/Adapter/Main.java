package src.main.java.com.IlonaA.javacore.Patterns.Adapter;

public class Main {
    public static void main(String[] args) {
        Foreigner human = new Adapter();
        human.tryToread();
        Foreigner human2 = new Adapter2(new EnglishBook());
        human.tryToread();
    }
}
