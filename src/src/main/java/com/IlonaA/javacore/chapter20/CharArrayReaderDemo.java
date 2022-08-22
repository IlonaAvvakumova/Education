package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "ajghfkjhgirlkfhjtgklhjn";
        int lenght = tmp.length();
        char c[] = new char[lenght];

        tmp.getChars(0,lenght,c,0);
        int i;

        try(CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1:");
            while ((i=input1.read()) != -1)
                System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(CharArrayReader input2 = new CharArrayReader(c,0,5)) {
            System.out.println("input2:");
            while ((i = input2.read()) !=-1)
                System.out.print((char) i);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
