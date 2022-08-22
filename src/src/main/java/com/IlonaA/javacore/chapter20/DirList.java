package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.File;
import java.util.Arrays;

public class DirList {
    public static void main(String[] args) {
        String dirname = "D:\\java\\home\\avvakumova\\dev\\education\\src\\src\\main\\java\\com\\IlonaA\\javacore";
        File f1 = new File(dirname);
       if (f1.isDirectory()){
            System.out.println("Catalog " + dirname);
            String s[] = f1.list(); //список имен файлов

            for (int i = 0; i < s.length; i++) {
              File f = new File(dirname + "/" + s[i]); //подставляем список имен в конец адреса, что бы проверить каждый адрес
                if (f.isDirectory()) System.out.println(s[i] + " catalog");
               else System.out.println(s[i] + " ne catalog");
            }
        }

      File[] files = f1.listFiles(); // возвращает массив типа File. показывает список файлов
        System.out.println(Arrays.toString(files ));
        System.out.println(Arrays.toString(f1.list()));//выводит список файлов
    }
}
