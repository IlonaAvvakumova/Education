package src.main.java.com.IlonaA.javacore.Patterns.Template;

abstract class Animal {

    void behaviour(){
        sound();
        System.out.println("Бежит...");
        System.out.println("Прыгает...");
        System.out.println("Кусается...");
    }
    abstract void sound();
}
