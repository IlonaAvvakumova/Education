package src.main.java.com.IlonaA.javacore.test3.test5;

public class Func implements  UtilsFunc{
    @Override
    public Object func(String s) {
        if (s.length() > 5)
        return "Это метод FUNC";
        return "Второе условие метода FUNC";
    }
}
