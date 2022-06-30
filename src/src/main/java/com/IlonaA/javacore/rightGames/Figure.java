package src.main.java.com.IlonaA.javacore.rightGames;


public enum Figure {
    STONE(1),  SCISSORS(2),PAPER(3);

    private Integer value;

    Figure(int i) {
        this.value = i;
    }

    public Integer getValue() {
        return value;
    }


    public static Figure getByValue(Integer value) {
        for (int i = 0; i < Figure.values().length; i++) {
            if(Figure.values()[i].getValue().equals(value)) {
                return Figure.values()[i];
            }
        }
        return null;
    }
}
