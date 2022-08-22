package src.main.java.com.IlonaA.javacore.chapter10;

public class FinallyDemo {
    //сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("В теле методы procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    //возратить управление из блока оператора try
    static void procC() {
        try {
            System.out.println("В теле метода procC()");

        } finally {
            System.out.println("Блок оператора finally в методе procC");
        }
    }

    static void procB() {
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " + e);
        }
        System.out.println("--------------");
        procC();
        System.out.println("--------------");
        procB();
    }

}
