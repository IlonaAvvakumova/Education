package src.main.java.com.IlonaA.javacore.Patterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Books implements Library{

    List<Library> list = new ArrayList<>();


    void addBook(Library ... libraries){
        list.addAll(Arrays.asList(libraries));
    }
    void remove(Library libraries){
        list.remove(libraries);
    }

    public void print(){
        for (Library b:list
             ) {
            b.print();
        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "list=" + list +
                '}';
    }
}
