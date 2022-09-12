package src.main.java.com.IlonaA.javacore.Patterns.State;

public class LiquidState implements State {
    Enum anEnum = Enum.ЖИДКОЕ;

    public Enum getAnEnum() {
        return anEnum;
    }

    @Override
    public void freeze(Context context) {
        context.setState(new SolidState());
    }

    @Override
    public void heat(Context context) {
        context.setState(new GaseousState());
    }
}
