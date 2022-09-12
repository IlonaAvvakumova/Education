package src.main.java.com.IlonaA.javacore.Patterns.Mediator;

public class Somebody extends Human {
    String name;


    public Somebody(String name, Pochta pochta) {
        this.name = name;
        this.pochta = pochta;
    }

    public String getName() {
        return name;
    }


    @Override
    public void getLetters(String letter) {
        System.out.println(this.name + " получает + письмо с темой: " + letter);
    }
}
