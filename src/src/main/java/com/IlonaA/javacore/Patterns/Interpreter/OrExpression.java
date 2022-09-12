package src.main.java.com.IlonaA.javacore.Patterns.Interpreter;

public class OrExpression implements Expression{
    Expression expr1;
    Expression expr2;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpreter(String str) {
        System.out.println("Выражение ");
       return  expr1.interpreter(str) || expr2.interpreter(str);
    }
}
