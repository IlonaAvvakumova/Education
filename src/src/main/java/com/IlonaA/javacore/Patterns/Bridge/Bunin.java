package src.main.java.com.IlonaA.javacore.Patterns.Bridge;

public class Bunin extends Autor{
    public Bunin(Genre genre) {
        super(genre);
    }

    @Override
    void read() {
genre.chooseGenre("Бунин написал не мало ");
    }
}
