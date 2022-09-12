package src.main.java.com.IlonaA.javacore.Patterns.Facade;

public class Faced {
    Roof roof = new Roof();
    Basement basement = new Basement();
    Windows windows = new Windows();
    Walls walls = new Walls();
    void done(){

        basement.createBasement();
        walls.createWalls();
        roof.createRoof();
        windows.createWindows();

        System.out.println("Дом построен!");
    }
}
