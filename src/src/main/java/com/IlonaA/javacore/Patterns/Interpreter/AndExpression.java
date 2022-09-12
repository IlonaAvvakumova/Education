package src.main.java.com.IlonaA.javacore.Patterns.Interpreter;

public class AndExpression implements Expression{
    Expression exp1;
    Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpreter(String str) {
        System.out.println("Выражение ");
        return exp1.interpreter(str) && exp2.interpreter(str);
    }
}
