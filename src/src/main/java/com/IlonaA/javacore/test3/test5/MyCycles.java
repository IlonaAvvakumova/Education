package src.main.java.com.IlonaA.javacore.test3.test5;

public class MyCycles {
    UtilsFunc ufunc;

    public MyCycles(UtilsFunc ufunc) {
        this.ufunc = ufunc;
    }

    public void cycleForExample(int interation, String str) {
        for (int i = 0; i < interation; i++) {
ufunc.func(str);

        }


    }
}
