package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Содержимое списочного массива al: " + al);

        //получить обычный массив
  /*      Integer ia[] =new Integer[al.size()];
        ia = al.toArray(ia); или запись ниже, ноль пишется по умолчанию, массисив и так будет расширен автоматически до необходимого*/
        Integer[] ia = al.toArray(new Integer[0]);

        int sum = 0;
        //суммировать элементы массива
        for (int i:ia
             ) {
            sum+=i;
        }
        System.out.println("Summa: " + sum);
    }
}
