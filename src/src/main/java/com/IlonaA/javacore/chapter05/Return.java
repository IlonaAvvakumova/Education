package src.main.java.com.IlonaA.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата");
        if(t) return; //управление возвращается вызывающему объекту
        System.out.println("Это оператор выполняться не будет ");
    }
}
