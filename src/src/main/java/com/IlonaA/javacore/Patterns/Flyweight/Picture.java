package src.main.java.com.IlonaA.javacore.Patterns.Flyweight;

public class Picture extends Base{
String parametr = "для различия объектов";
    public Picture() {
        name = "Madonna";
        age = 356;
        author = new StringBuilder("Rafael");
        price = 1_000_000.52;

    }

    @Override
    void show() {
        System.out.println("Создана картина " + name + " автор " + author);
    }
}
