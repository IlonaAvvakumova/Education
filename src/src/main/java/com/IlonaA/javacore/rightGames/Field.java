package src.main.java.com.IlonaA.javacore.rightGames;

public class Field {
    private Figure figure1;
    private Figure figure2;

    public Figure getFigure1() {
        return figure1;
    }

    public Figure getFigure2() {
        return figure2;
    }

    public void setFigure1(Figure figure1) {
        this.figure1 = figure1;
    }

    public void setFigure2(Figure figure2) {
        this.figure2 = figure2;
    }

    @Override
    public String toString() {
        return "Field{" +
                "p1='" + figure1 + '\'' +
                ", p2='" + figure2 + '\'' +
                '}';
    }
}
