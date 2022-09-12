package src.main.java.com.IlonaA.javacore.Patterns.State;

public class SolidState implements State {
    Enum anEnum = Enum.ТВЕРДОЕ;

    public Enum getAnEnum() {
        return anEnum;
    }

    @Override
    public void freeze(Context context) {
        System.out.println("Состояние не изменилось");
    }

    @Override
    public void heat(Context context) {
        context.setState(new LiquidState());
    }
}
