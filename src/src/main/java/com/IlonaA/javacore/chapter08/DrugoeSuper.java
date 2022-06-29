package src.main.java.com.IlonaA.javacore.chapter08;

//Использовать ключевое слово super с целью предотврать сокрытие имен
public class DrugoeSuper {
    int i;
}

class Primenenie extends DrugoeSuper {
    int i;

    Primenenie(int a, int b) {
        super.i = a; // член из класса DrugoeSuper.Ключевое слово super дает доступ к i в суперклассе
        i = b; //член из класса Primenenie
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        Primenenie test = new Primenenie(1, 2);
        test.show();
    }
}
