package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String s= "FileReaderDemo.java";
        //FileWriter f = new FileWriter(s);
        try(FileReader fr = new FileReader(s)) {
           int c;

           //прочитать и вывести содержимое файла
            while ((c=fr.read())!=-1)
                System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
