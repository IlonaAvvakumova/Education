package src.main.java.com.IlonaA.javacore.Patterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        Library poem = new Poem();
        Library poem2 = new Poem();
        Library story = new Story();
        Library story2 = new Story();
//в каждом есть уже лист, добавляем в него поемы и стихи
       Books book = new Books();
        Books book2 = new Books();
        Books book3 = new Books();

        book.addBook(poem,story,story2);
        book2.addBook(poem,poem2,story2);
        book3.addBook(story2);

        //верхняя папка каталога содержит книги в которых рассказы и поэмы

        book3.addBook(book,book2);
        for (Library b:book3.list
             ) {
            System.out.println(b);
        }

    }
}
