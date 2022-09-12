package src.main.java.com.IlonaA.javacore.Patterns.Chainofresponsibilit;

public class Main {
    public static void main(String[] args) {
        Fair fair = new Small(Fair.WATER);
         fair.setNextFair(new Average(Fair.CALLS)).setNextFair(new Big(Fair.RUNS));



        fair.action("При крупном возгорании " ,Fair.RUNS);
        fair.action("При среднем огне нужно: " ,Fair.CALLS);
        fair.action("При небольшом возгорании нужно: " ,Fair.WATER);

    }
}
