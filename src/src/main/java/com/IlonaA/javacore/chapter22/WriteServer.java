package src.main.java.com.IlonaA.javacore.chapter22;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//продемоснтировать обработку дейтаграмм
public class WriteServer {
    public  static int serverPort = 998;
    public  static int clientPort = 999;
    public  static int buffer_size = 1024;
    public  static DatagramSocket ds;
    public  static byte buffer[] = new byte[buffer_size];

    public static void TheServer() throws IOException {
        int pos = 0;
        while (true){
            int c = System.in.read();
            switch (c){
                case -1:
                    System.out.println("Сервер завершает сеанс связи");
                    ds.close();
                    return;
                case'\r':
                    break;
                case '\n':
                    ds.send(new DatagramPacket(buffer,pos, InetAddress.getLocalHost(),clientPort));
                    pos=0;
                    break;
                default:
                    buffer[pos++] = (byte) c;
            }
        }
    }
    public  static void TheClient() throws IOException {
        while (true){
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            ds.receive(p);
            System.out.println(new String(p.getData(),0,p.getLength()));
        }
    }

    public static void main(String[] args) throws IOException {
        if(args.length == 1){
            ds = new DatagramSocket(serverPort);
            TheServer();
        }else{
            ds = new DatagramSocket(clientPort);
            TheClient();
        }
    }
}
