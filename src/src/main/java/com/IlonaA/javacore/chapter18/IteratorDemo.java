package src.main.java.com.IlonaA.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String > al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        //использовать итераторы для вывода содержимого списочного массива
        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){ //пока есть следующий элемент
            String element  = itr.next(); //присвоить значение текущего элемента
            System.out.print(element + " ");
        }
        System.out.println();

        //видоизменить перебираемый объект
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element+ "+");
        }
        System.out.print("Измененное содержимое списочного массива al: ");
//вывод после изменения
        itr = al.iterator();
        while (itr.hasNext()){
            String element  = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //отобразить список в обратном порядке
        System.out.println("Измененный в обратном порядке список: ");
        while (litr.hasPrevious()){ //проверка существует ли предыдущий элемент
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
