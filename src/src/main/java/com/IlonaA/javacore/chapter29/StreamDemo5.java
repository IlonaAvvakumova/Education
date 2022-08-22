package src.main.java.com.IlonaA.javacore.chapter29;
//Применить метод map() для создания нового потока данных содержащего только избранные элементы из исходного потока
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}
class NamePhone{
    String name1;
    String phonenum1;

    public NamePhone(String name1, String phonenum1) {
        this.name1 = name1;
        this.phonenum1 = phonenum1;
    }
}
public class StreamDemo5 {
    public static void main(String[] args) {
//Список имен, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри","555-5555","Larry@HerbSchild.com"));
        myList.add(new NamePhoneEmail("Джеймс","555-4444","James@HerbSchild.com"));
        myList.add(new NamePhoneEmail("Мэри","555-3333","Mary@HerbSchild.com"));
        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach(a-> System.out.println(a.name + " " + a.phonenum + " "+ a.email));
        System.out.println();
//отобразить на новый поток данных только имена и номера телефонов
        Stream<NamePhone> nameAndPhone = myList.stream().map(a->new NamePhone(a.name,a.phonenum));
        //взять каждый элемент стрима и создать новый объект в качестве параметров используя элементы другого класса
        //Stream<NamePhone> nameAndPhone = myList.stream().filter(a->a.name.equals("Джеймс")).map(a->new NamePhone(a.name,a.phonenum));
        //отсортировать а потом присвоить

        System.out.println("Список имен и номеров телефонов:  ");
        nameAndPhone.forEach(a-> System.out.println(a.name1 + " " + a.phonenum1));
    }
}
class StreamDemo7{
    public static void main(String[] args) {
//Список имен, номеров телефонов и адресов электронной почты
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри","555-5555","Larry@HerbSchild.com"));
        myList.add(new NamePhoneEmail("Джеймс","555-4444","James@HerbSchild.com"));
        myList.add(new NamePhoneEmail("Мэри","555-3333","Mary@HerbSchild.com"));
       //отобразить только имена и номера телефонов на новый поток данных
        Stream<NamePhone> nameAndPhone = myList.stream().map(a->new NamePhone(a.name,a.phonenum));
        //вызвать метод collect() чтобы составить список типа List из имен и номеров телефонов
        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и номера телефонов в списке типа List: ");
        for (NamePhone e : npList)
            System.out.println(e.name1 + ": " + e.phonenum1);
//получить другое отображение, снова открываем заново поток
        nameAndPhone = myList.stream().map(a->new NamePhone(a.name,a.phonenum));
        //а теперь создать множество типа Set вызвав метод collect()
        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nИмена и номера телефонов в множестве типа Set: ");
        for (NamePhone e : npSet)
            System.out.println(e.name1 + ": " + e.phonenum1);
//создание списка другого типа:
        nameAndPhone = myList.stream().map(a->new NamePhone(a.name,a.phonenum));
        //лямбда выражние возвращающее новый список типа LinkedList-> add добавление элемента в список -> addAll обединение двух списков
        LinkedList<NamePhone> npList2 = nameAndPhone.collect(()->new LinkedList<>(),(list, element)->list.add(element),
                (listA,listB)->listA.addAll(listB));
        System.out.println("\nИмена и номера телефонов в linkedList: ");
        for (NamePhone e : npList2)
            System.out.println(e.name1 + ": " + e.phonenum1);
//альтернативное создание с помощью ссылок на метод
        nameAndPhone = myList.stream().map(a->new NamePhone(a.name,a.phonenum));

        HashSet<NamePhone> npSet2 = nameAndPhone.collect(HashSet :: new, HashSet :: add, HashSet :: addAll);

        System.out.println("\nИмена и номера телефонов в HashSet: ");
        for (NamePhone e : npSet2)
            System.out.println(e.name1 + ": " + e.phonenum1);
    }
}