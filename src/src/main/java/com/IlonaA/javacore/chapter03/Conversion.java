package src.main.java.com.IlonaA.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\n Преобразование типа int в тип byte. ");
        b = (byte) i; // b становится равен остатку от деления 257/256(диапазон допустимых значений byte)
        System.out.println(" i и b " + i + " " + b);
        System.out.println("\n преобразование типа double в тип int.");
        i = (int) d;
        System.out.println(" d и i " + d + " " + i);
        System.out.println("\n преобразование типа double в тип byte");
        b = (byte) d; // дробное значение отбрасывается, b ставится равен остатку от деления от 323/256
        System.out.println("d и b " + d + " " + b);
    }
}
