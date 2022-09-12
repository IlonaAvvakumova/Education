package src.main.java.com.IlonaA.javacore.Patterns.Chainofresponsibilit;

public abstract class Fair {
    public static int WATER = 3;
    public static int CALLS = 2;
    public static int RUNS = 1;
    int mask;

    //следующий элемент в цепочке обязанностей
    Fair nextFair;

    public Fair setNextFair(Fair nextFair) {
        this.nextFair = nextFair;
        return nextFair;
    }

    void action(String msg, int priority){
        if(priority <= mask){
            doing(msg);}
if(nextFair != null)
    nextFair.action(msg,priority);
    }

    abstract void doing(String msg);
}
