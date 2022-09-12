package src.main.java.com.IlonaA.javacore.Patterns.Builder;

abstract class HumanBuilder { //Builder, может быть и интерфейсом
    Human human;
    void createHuman(){
        human = new Human();
    }
    abstract void buildName();
    abstract void buildAge();
    abstract void buildSex();
    abstract void buildHair();

    Human getHuman(){
        return human;
    }

}
