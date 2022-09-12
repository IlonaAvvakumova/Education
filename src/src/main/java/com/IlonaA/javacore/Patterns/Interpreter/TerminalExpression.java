package src.main.java.com.IlonaA.javacore.Patterns.Interpreter;

public class TerminalExpression implements Expression{
    String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpreter(String str) {
        if (str.contains(data))
            return true;

        return false;
    }
}
