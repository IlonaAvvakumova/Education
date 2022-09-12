package src.main.java.com.IlonaA.javacore.Patterns.Chainofresponsibilit;

public class Average extends Fair{
    public Average(int mask) {
        this.mask = mask;
    }

    @Override
    void doing(String msg) {
        System.out.println(msg + " звонить 01");
    }
}
