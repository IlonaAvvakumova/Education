package src.main.java.com.IlonaA.javacore.Patterns.Prototype;

public class FactorySheep {
    OriginalSheep sheep;

    public FactorySheep(OriginalSheep sheep) {
        this.sheep = sheep;
    }

  /*  public void setSheep(OriginalSheep sheep) {
        this.sheep = sheep;
    }*/
    OriginalSheep copySheep(){
        return (OriginalSheep) sheep.copy();
    }
}
