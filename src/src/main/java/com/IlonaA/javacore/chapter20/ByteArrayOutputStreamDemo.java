package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эти данные должны быть выведены в массив";
        byte buf [] = s.getBytes();
        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }
        System.out.println("Буфер в виде символьной строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        byte b[] = f.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }
        System.out.println("\nВ поток вывода типа OutputStream()");
        //упраление потоком ввода-вывода в файл
        try(FileOutputStream f2 = new FileOutputStream("test4.txt")) {
            f.writeTo(f2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Установка в исходное состояние");
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');

        }
        System.out.println(f.toString());
    }
}
