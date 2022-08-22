package src.main.java.com.IlonaA.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "src/src/main/java/com/IlonaA/javacore";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = f1.list(only);//список названия файлов в папке
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }
    }
}
class OnlyExt implements FilenameFilter{
    String ext;
    public OnlyExt(String ext){//конструктор для добавление точки перед расширением файла
        this.ext = "."+ext;
    }
    public boolean accept(File dir, String name){//метод вызывается один раз с каждым файлом из списка
        return name.endsWith(ext);
    }

}