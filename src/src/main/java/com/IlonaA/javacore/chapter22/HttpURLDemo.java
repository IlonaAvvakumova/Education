package src.main.java.com.IlonaA.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");
        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();
        //вывести метод запроса
        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        //вывести код ответа
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        //вывести ответное сообщение
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());
        //получить список полей и множество ключей из заголовка
        Map<String, List<String>> hdrMap = hpCon.getHeaderFields();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nДалее следует заголовок:");
        //вывести все ключи и значения из заголовка
        for (String k:hdrField
             ) {
            System.out.println("Ключ: " + k +" Значение:" + hdrMap.get(k));
        }
    }
}
