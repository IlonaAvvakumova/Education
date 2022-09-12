package src.main.java.com.IlonaA.javacore.Patterns.State;

public class Main {
    public static void main(String[] args) {
        Context st = new Context();
        st.freezing();
        st.heating();
        st.heating();
        st.freezing();
        st.heating();
        st.freezing();
        st.freezing();

    }
}
