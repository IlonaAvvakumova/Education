package src.main.java.com.IlonaA.javacore.Patterns.Prototype;

public class Main {
    public static void main(String[] args) {
        OriginalSheep sheep = new OriginalSheep("Dolly", 7); //создаем оригинальный объект
        //делаем копию объекта с помощью фабрики
        FactorySheep factorySheep = new FactorySheep(sheep);
        OriginalSheep sheep2 = factorySheep.copySheep();
        System.out.println(sheep2);

    }
}
