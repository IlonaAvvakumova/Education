package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        //создать фильтр возвращающий логическое значение true
        //только в отношении доступных для записи файлов
        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return true;
                return false;
            }
        };
        //получить и использовать поток ввода из каталога
        //только доступных для записи файлов
        try(DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println("Каталог " + dirname);

            // Класс DirectoryStream реализует интерфейс  Iterable поэтому для вывода содержимого каталога можно
            //  организовать цикл for  в стиле  for each
            for (Path entry:dirstrm
                 ) {
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attribs.isDirectory()) System.out.println("<DIR ");
                else System.out.println("      ");
                System.out.println(entry.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
