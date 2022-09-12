package src.main.java.com.IlonaA.javacore.Patterns.Command;

public class LieCommand implements Command{
    DogsCommands dogsCommands;

    public LieCommand(DogsCommands dogsCommands) {
        this.dogsCommands = dogsCommands;
    }

    @Override
    public void execute() {
        dogsCommands.lie();
    }
}
