package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "Eto avtorskii znak &copy; "+ ", a &copy - net.\n";
        byte buf[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int a;
        boolean marked = false;

        try(BufferedInputStream f = new BufferedInputStream(in)) {
            while ((a = f.read()) != -1){ // пока поток читает строку байтами и не достигнут конец строки
                switch (a){
                    case '&':
                        if(!marked){
                            f.mark(32);
                            marked = true;
                        }else{
                            marked = false;}
                        break;
                    case';':
                        if(marked){
                            marked = false;
                            System.out.print("(c)");
                        }else System.out.print((char) a);
                        break;
                    case' ':
                        if (marked){
                            marked = false;
                            f.reset();
                            System.out.print("&");
                        }else System.out.print((char) a);
                        break;
                    default:
                        if (!marked) System.out.print((char) a);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
