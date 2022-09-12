package src.main.java.com.IlonaA.javacore.Patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Sommelier implements Collection {

    List<String> wines = new ArrayList<>();

    @Override
    public Iterator getIterator() {
        return new WineIterator();
    }

    //Внутренний класс имплементирующий интерфейс Итератор
    public class WineIterator implements Iterator{
int index;
        @Override
        public boolean hasNext() {
            if (index < wines.size())
                return true;
            return false;
        }

        @Override
        public Object next() {
            return wines.get(index++);
        }
    }
}
