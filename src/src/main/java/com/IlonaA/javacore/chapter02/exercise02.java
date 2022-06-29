package src.main.java.com.IlonaA.javacore.chapter02;

public class exercise02 {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x<y) System.out.println("x меньше y");
        x = x*2;
        if (x==y) System.out.println("x теперь ровно y");
        x = x*2;
        if (x>y) System.out.println("x теперь больше y");
        // это оператор не будет ничего выводить
        if (x == y) System.out.println(" вы не увидите этого");
    }
}
