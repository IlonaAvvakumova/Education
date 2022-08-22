package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;
        try {
            //сначала открыть файл для ввода
            fIn = new FileInputStream("text.txt");
            //затем получить канал к этому файлу
            fChan = fIn.getChannel();
            //выделить оперативную память под буфер
            mBuf = ByteBuffer.allocate(128);
            do {
                //читать данные в буфер
                count = fChan.read(mBuf);
                //прекратить чтение до достижении конца файла
                if (count != -1){
                    //подготовить буфер к чтению из него данных
                    mBuf.rewind();
                    //читать байты данных из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }

                }
            }while (count!=-1);
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fChan != null) fChan.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fIn != null) fIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
