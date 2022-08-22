package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args) {
        try(FileInputStream fi = new FileInputStream("file1.txt"); FileOutputStream fo= new FileOutputStream("text.txt")) {
            byte [] b = new byte[4526];
            int c;
            while ((c = fi.read(b))!=-1){
                fo.write(b,0,c);
                fi.read(b);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
