package src.main.java.com.IlonaA.javacore.chapter10;

public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b=0;
        int vals[] = {1,2,3};

        try {
        //    int result = a/b;// сгенерировать искл типа ArithmeticException
            vals[10] = 19;  // сгенерировать искл типа ArrayIndexOutOfBoundsException
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){//перехватываются оба исключчения
            System.out.println("Исключение перехвачено: " + e);
        }
        System.out.println("После многократного перехвата");
    }
}
