package src.main.java.com.IlonaA.javacore.Patterns.Command;

public class Dog {
    Command sit;
    Command lie;
    Command voice;

    public Dog(Command sit, Command lie, Command voice) {
        this.sit = sit;
        this.lie = lie;
        this.voice = voice;
    }

    void sitCommand(){
        sit.execute();
    }
    void lieCommand(){
        lie.execute();
    }
    void voiceCommand(){
        voice.execute();
    }
}
