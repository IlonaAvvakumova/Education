package src.main.java.com.IlonaA.javacore.Patterns.Command;

public class Main {
    public static void main(String[] args) {
        DogsCommands dogsCommands = new DogsCommands();
        Dog sharik = new Dog(new SitCommand(dogsCommands), new LieCommand(dogsCommands), new VoiceCommand(dogsCommands));

        sharik.sitCommand();
        sharik.lieCommand();
        sharik.voiceCommand();
    }
}
