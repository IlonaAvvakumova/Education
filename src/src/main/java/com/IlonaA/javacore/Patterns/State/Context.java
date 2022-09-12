package src.main.java.com.IlonaA.javacore.Patterns.State;

public class Context {
    private State state = new SolidState(); //изначальное состояние объекта

    public void setState(State state) {
        System.out.println("Состояние изменилось на " + state.getAnEnum());
        this.state = state;
    }

    public State getState() {
        return state;
    }

    void freezing() {
        System.out.println("Заморозить " + state.getAnEnum() + " вещество");
        state.freeze(this);
    }

    void heating() {
        System.out.println("Нагреть " + state.getAnEnum() + " вещество");
        state.heat(this);
    }
}
