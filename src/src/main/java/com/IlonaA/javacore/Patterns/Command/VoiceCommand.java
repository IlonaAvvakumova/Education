package src.main.java.com.IlonaA.javacore.Patterns.Command;

public class VoiceCommand implements Command{
    DogsCommands dogsCommands;

    public VoiceCommand(DogsCommands dogsCommands) {
        this.dogsCommands = dogsCommands;
    }

    @Override
    public void execute() {
        dogsCommands.voice();
    }
}
