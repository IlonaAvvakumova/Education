package src.main.java.com.IlonaA.javacore.Patterns.State;

public interface State {
    Enum getAnEnum();

    void freeze(Context context);
    void heat(Context context);
}
