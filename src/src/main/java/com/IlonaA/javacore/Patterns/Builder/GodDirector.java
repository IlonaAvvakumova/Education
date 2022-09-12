package src.main.java.com.IlonaA.javacore.Patterns.Builder;

public class GodDirector {
    HumanBuilder builder;
    void setBuilder(HumanBuilder humanBuilder){
        this.builder = humanBuilder;
    }
    Human buildHuman1(){
        builder.createHuman();
        builder.buildName();
        builder.buildAge();
        builder.buildSex();
        builder.buildHair();
        Human humanoid = builder.getHuman();
        return humanoid;
    }
    Human buildHuman2(){
        builder.createHuman();
        builder.buildName();
        builder.buildAge();

        Human humanoid = builder.getHuman();
        return humanoid;
    }
}
