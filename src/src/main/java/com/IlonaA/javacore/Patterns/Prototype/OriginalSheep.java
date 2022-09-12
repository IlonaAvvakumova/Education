package src.main.java.com.IlonaA.javacore.Patterns.Prototype;

public class OriginalSheep implements CloneInterface{
  private   String name;
   private Integer weight;
    public OriginalSheep(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

  /*  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }*/

    @Override
    public String toString() {
        return "OriginalSheep{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public Object copy() {
        OriginalSheep copy = new OriginalSheep(name, weight);
        return copy;
    }
}
