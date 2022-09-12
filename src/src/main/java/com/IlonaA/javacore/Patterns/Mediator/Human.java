package src.main.java.com.IlonaA.javacore.Patterns.Mediator;

public abstract class Human {
        Pochta pochta;
    void send(String letter){
        pochta.sendLetters(letter, this);
    }
    abstract void getLetters(String letter);
}
