package src.main.java.com.IlonaA.javacore.Patterns.Command;

public class SitCommand implements Command{
    DogsCommands dogsCommands;

    public SitCommand(DogsCommands dogsCommands) {
        this.dogsCommands = dogsCommands;
    }

    @Override
    public void execute() {
        dogsCommands.sit();
    }
}
