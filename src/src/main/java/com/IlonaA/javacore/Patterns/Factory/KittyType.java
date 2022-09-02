package src.main.java.com.IlonaA.javacore.Patterns.Factory;

import java.util.Random;

public enum KittyType {
    BLACK, BROWN, WHITE;
//рандомный выбор для цвета котенка
    private static final KittyType[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static KittyType getRandomLetter()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
