package src.main.java.com.IlonaA.javacore.Patterns.Chainofresponsibilit;

public class Small extends Fair{
    public Small(int mask) {
        this.mask = mask;
    }

    @Override
    void doing(String msg) {
        System.out.println(msg + " тушить водой");
    }
}
