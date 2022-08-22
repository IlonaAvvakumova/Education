package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"+
                " to come to the aid of their contry\n"+
                " and pay their due taxes";
        byte buf[] = source.getBytes(); //кодирует данную строку в последовательность байтов


        try( FileOutputStream f0= new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")) {

            //записать данные в первый файл
            for (int i = 0; i < buf.length; i+=2) {
             f0.write(buf[i]);
            }
            //записать данные во второй файл
            f1.write(buf);
            //записать данные в третий файл
            f2.write(buf, buf.length- buf.length/4, buf.length/4 );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
