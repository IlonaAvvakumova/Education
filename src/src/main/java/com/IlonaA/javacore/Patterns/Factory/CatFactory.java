package src.main.java.com.IlonaA.javacore.Patterns.Factory;

import src.main.java.com.IlonaA.javacore.Patterns.Factory.TypeCat.BlackKitty;
import src.main.java.com.IlonaA.javacore.Patterns.Factory.TypeCat.BrownKitty;
import src.main.java.com.IlonaA.javacore.Patterns.Factory.TypeCat.Cat;
import src.main.java.com.IlonaA.javacore.Patterns.Factory.TypeCat.WhiteKitty;

public class CatFactory {

    private static Integer summaBrown=0;
    private static Integer summaBlack=0;
    private static Integer summaWhite=0;

    public Cat getCatFactory(KittyType kittyType) {
        if (kittyType.equals(KittyType.BROWN)) {
            summaBrown++;
            return new BrownKitty();
        }else if(kittyType.equals(KittyType.BLACK)){
            summaBlack++;
            return new BlackKitty();
        }else if(kittyType.equals(KittyType.WHITE)){
            summaWhite++;
            return new WhiteKitty();
        }else
            throw new RuntimeException("Таких котиков не бывает");
    }

    public void getSummaCat(){
        System.out.println("Всего родилось котиков: " + (summaWhite+summaBlack+summaBrown) +
                "\n из них коричневых было: " + summaBrown + "\n черных было: "+ summaBlack+
                "\n белых было: " + summaWhite);
    }
}
