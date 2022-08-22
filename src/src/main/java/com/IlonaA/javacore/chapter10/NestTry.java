package src.main.java.com.IlonaA.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try {

            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try {
                if (a == 1) a = a / (a - a);//деление на ноль, обработает внешний catch(если передать один аргументв в ком.строку)
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;// исключение в связи с выходом за пределы массива, обработает внутренний catch, передать два аргумент в КС
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Индекс за пределами массива: " + e);
            }
        }catch (ArithmeticException e){
            System.out.println("Деление на нуль: " + e);
        }
    }
}
