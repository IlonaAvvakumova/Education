package src.main.java.com.IlonaA.javacore.Patterns.Chainofresponsibilit;

public class Big extends Fair{
    public Big(int mask) {
        this.mask = mask;
    }

    @Override
    void doing(String msg) {
        System.out.println(  msg + " бежать с места пожара");
    }
}
