package src.main.java.com.IlonaA.javacore.Patterns.State;

public class GaseousState implements State{
    Enum anEnum = Enum.ГАЗООБРАЗНОЕ;

    public Enum getAnEnum() {
        return anEnum;
    }
    @Override
    public void freeze(Context context) {
context.setState(new LiquidState());
    }

    @Override
    public void heat(Context context) {
        System.out.println("Состояние не изменяется");
    }
}
