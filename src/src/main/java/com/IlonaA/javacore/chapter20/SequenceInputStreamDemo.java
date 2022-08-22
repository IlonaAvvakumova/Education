package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        try( InputStream input = new SequenceInputStream(ise)) {
            while ((c = input.read()) != -1)
            System.out.print((char) c);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class InputStreamEnumerator implements Enumeration<FileInputStream>{
    private Enumeration<String> files;
    public InputStreamEnumerator (Vector<String> files){
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (FileNotFoundException e) {
            return null;
        }
    }
}