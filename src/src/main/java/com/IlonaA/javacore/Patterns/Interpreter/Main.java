package src.main.java.com.IlonaA.javacore.Patterns.Interpreter;

public class Main {
    public static void main(String[] args) {
        Expression human = new TerminalExpression("Vova");
        Expression human2 = new TerminalExpression("Nadya");

        Expression or = new OrExpression(human,human2);
        Expression and = new AndExpression(human,human2);

        System.out.println( or.interpreter("Vova"));

        System.out.println(and.interpreter("Vova Nadya"));



    }
}
