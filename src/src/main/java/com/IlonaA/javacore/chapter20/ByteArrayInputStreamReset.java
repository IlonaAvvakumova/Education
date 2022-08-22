package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

//каждый символ читается из потока ввода а заметм выводится без изменений в нижнем регистре
//далее поток устаналивается в исходное положение и чтение данных начинается снова но в это раз
//каждый символ преобразуется в верхний регистр
public class ByteArrayInputStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte b [] = tmp.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        for (int i = 0; i < 2; i++) {
           int c;
           while ((c=in.read()) !=-1) {
               if (i == 0) {
                   System.out.print((char) c);
               } else System.out.print(Character.toUpperCase((char) c));
           }
            System.out.println();
           in.reset();
        }

    }
}
