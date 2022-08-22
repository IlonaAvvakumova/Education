package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrute {
    public static void main(String[] args) {
        //открыть файл и получить связанный с ним поток вывода
        try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("text.txt")))) {
            //вывести поток в заданное количество файлов
            for (int i = 0; i < 26; i++) {
                fout.write((byte) 'A' + i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
