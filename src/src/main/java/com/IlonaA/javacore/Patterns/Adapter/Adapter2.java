package src.main.java.com.IlonaA.javacore.Patterns.Adapter;

public class Adapter2 implements Foreigner{
    EnglishBook englishBook;

    public Adapter2(EnglishBook englishBook) {
        this.englishBook = englishBook;
    }

    @Override
    public void tryToread() {
        englishBook.openBook();
        System.out.println("Адаптер переводит текст для второго человека и теперь можно: ");
        englishBook.readBook();
        englishBook.closeBook();
    }
}
