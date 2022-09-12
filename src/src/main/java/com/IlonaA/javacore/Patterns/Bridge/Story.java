package src.main.java.com.IlonaA.javacore.Patterns.Bridge;

public class Story implements Genre{
    @Override
    public void chooseGenre(String str) {
        System.out.println(str + "интересных историй");
    }
}
