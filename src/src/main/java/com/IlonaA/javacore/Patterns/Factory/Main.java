package src.main.java.com.IlonaA.javacore.Patterns.Factory;
/*Реализовать паттерн Factory на примере рождения котиков*/
public class Main {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
//рандомный котик
        Cat cat = catFactory.getCatFactory(KittyType.getRandomLetter());
cat.birth();
//котик на выбор
        Cat cat1 = catFactory.getCatFactory(KittyType.BLACK);
        cat1.birth();
        cat1 = catFactory.getCatFactory(KittyType.BROWN);
        cat1.birth();
        Cat cat3 = catFactory.getCatFactory(KittyType.WHITE);
        cat3.birth();
//подсчет родившихся котиков
        catFactory.getSummaCat();

    }
}
