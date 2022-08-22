package src.main.java.com.IlonaA.javacore.chapter15;
interface MyFunc{
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        //Локальная переменная которая может быть захвачена
        int num = 10;

        MyFunc myLambda = n -> {
            //такое применение переменной num допустимо поскольку она не видоизменяется
            int v = num +n;
            //Но следующая строка кода не допустима посколько в ней предпринимается попытка видеозменить значение переменной num

            //num++;
            return  v;
        };
        //И следующая строка кода приведет к ошибке посколько в ней нарушается действительно завершенное состояние переменной num
        //num = 9;
    }
}
