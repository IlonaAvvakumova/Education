package src.main.java.com.IlonaA.javacore.Patterns.Template;

public class Main {


    public static void main(String[] args) {
        Animal cat = new Cat();
        System.out.println("Кошка:");
        cat.behaviour();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Собака:");
        Animal dog = new Dog();
        dog.behaviour();
    }
}
