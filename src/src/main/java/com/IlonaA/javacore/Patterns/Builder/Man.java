package src.main.java.com.IlonaA.javacore.Patterns.Builder;

public class Man extends HumanBuilder {//ConcreteBuilder второй
    @Override
    void buildName() {
        human.setName("Adam");
    }

    @Override
    void buildAge() {
        human.setAge(42);
    }

    @Override
    void buildSex() {
        human.setSex(Sex.MAN);
    }

    @Override
    void buildHair() {
        human.setHair(false);
    }
}
