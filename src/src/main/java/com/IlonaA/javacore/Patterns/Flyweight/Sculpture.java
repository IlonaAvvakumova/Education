package src.main.java.com.IlonaA.javacore.Patterns.Flyweight;

public class Sculpture extends Base{

    public Sculpture() {
        name = "David";
        age = 654;
        author = new StringBuilder("Buonarroti");
        price = 2_000_000.43;

    }
    @Override
    void show() {
        System.out.println("Создана скульптура " + name + " автор " + author);
    }
}
