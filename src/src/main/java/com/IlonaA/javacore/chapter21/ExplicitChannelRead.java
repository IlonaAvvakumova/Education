package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        //канал открывается по пути возвращаемому методом Paths.get() в виде оюъекта типа Path
        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("text.txt"))) {
            //выделить памяти под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                //чиать данные из файла в буфер
                count = fChan.read(mBuf);
                //прекратить чтение по достижении конца файла
                if (count !=-1){
                    //подготоваить буфер к чтению из него данных
                    mBuf.rewind();
                    //читать байты данных из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            }while (count!=-1);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
