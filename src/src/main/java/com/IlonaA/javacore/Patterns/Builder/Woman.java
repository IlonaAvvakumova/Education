package src.main.java.com.IlonaA.javacore.Patterns.Builder;

public class Woman extends HumanBuilder { //ConcreteBuilder первый
    @Override
    void buildName() {
        human.setName("Eva");
    }

    @Override
    void buildAge() {
        human.setAge(23);
    }

    @Override
    void buildSex() {
        human.setSex(Sex.WOMAN);
    }

   @Override
    void buildHair() {
        human.setHair(true);
    }
}
