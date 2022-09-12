package src.main.java.com.IlonaA.javacore.Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        GodDirector god = new GodDirector();
        god.setBuilder(new Woman());
        Human woman = god.buildHuman1();
        System.out.println(woman);

        System.out.println("----------------------");
        god.setBuilder(new Man());
        Human man = god.buildHuman2();
        System.out.println(man);
    }
}
