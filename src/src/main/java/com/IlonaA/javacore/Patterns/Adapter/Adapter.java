package src.main.java.com.IlonaA.javacore.Patterns.Adapter;

public class Adapter extends EnglishBook implements Foreigner{
    @Override
    public void tryToread() {
        System.out.println("Адаптер переводит текст для первого человека и теперь можно: ");
        openBook();
        readBook();
        closeBook();
    }
}
