package src.main.java.com.IlonaA.javacore.Patterns.Bridge;

public class Pushkin extends Autor{
    public Pushkin(Genre genre) {
        super(genre);
    }

    @Override
    void read() {
        genre.chooseGenre("Пушкин написал много ");
    }
}
