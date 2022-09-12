package src.main.java.com.IlonaA.javacore.Patterns.Flyweight;

public class Main {


    public static void main(String[] args) {
        ArtworkFactory factory = new ArtworkFactory();
       Base art =  factory.getArtwork('A');
        Base art2 = factory.getArtwork('A');
        Base art3 = factory.getArtwork('B');
        Base art4 = factory.getArtwork('B');

        System.out.println(art2 == art);
        System.out.println(art == art3);
        System.out.println(art3 == art4);

    }
}
