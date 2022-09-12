package src.main.java.com.IlonaA.javacore.Patterns.Bridge;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Pushkin(new Poem());
        autor1.read();
         autor1 = new Pushkin(new Story());
        autor1.read();
        Autor autor2 = new Bunin(new Poem());
        autor2.read();
        autor2 = new Bunin(new Story());

        autor2.read();
    }
}
