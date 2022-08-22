package src.main.java.com.IlonaA.javacore.chapter15;
interface NumericTest{
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        //Лямбда выражение проверяющее является ли число четным
        NumericTest isEven = n -> (n%2)==0;

        if (isEven.test(10)) System.out.println("Число 10 четное");
        if (!isEven.test(9)) System.out.println("Число 9 нечетное");
        //А теперь вопсользоваться лямбда выражением в котором проверяется является ли число неотрицательным
        NumericTest isNonNeg = n -> n>=0;

        if (isNonNeg.test(1)) System.out.println("Число 1 неотрицательное");
        if (!isNonNeg.test(-1)) System.out.println("Число -1 отрицательное");
    }
}
