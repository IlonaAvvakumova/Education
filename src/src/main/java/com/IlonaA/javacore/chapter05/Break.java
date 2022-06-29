package src.main.java.com.IlonaA.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("Предшествует оператору break.");
                    if(t) break second;//оператор осущетсвляет переход в конец блока second
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
