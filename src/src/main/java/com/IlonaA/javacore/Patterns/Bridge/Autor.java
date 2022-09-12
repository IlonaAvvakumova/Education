package src.main.java.com.IlonaA.javacore.Patterns.Bridge;

public abstract class Autor {
    Genre genre;

    public Autor(Genre genre) {
        this.genre = genre;
    }
    abstract void read();
}
