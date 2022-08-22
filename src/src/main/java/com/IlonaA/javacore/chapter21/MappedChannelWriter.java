package src.main.java.com.IlonaA.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWriter {
    public static void main(String[] args) {
        //полуичть канал к файлу в блоке try
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("text.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.READ)) {
            //сопоставить файл с буфером
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE,0,26);
            //записать заданное количество байтов в буфер
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
