package src.main.java.com.IlonaA.javacore.chapter07;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = new String("Первая строка"); // != с 1, так как ссылка идет на новый объект,
        //равен только по equals
        String strOb4 = "Первая строка"; //равен с первым, потому что строка в Стринг пуле
        System.out.println("Длина строка 1: " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке 2: " + strOb2.charAt(3));

        if (strOb1.equals(strOb2))
            System.out.println("1 == 2");
        else
            System.out.println("1 != 2");

        if (strOb1.equals(strOb3))
            System.out.println("1 == 3");
        else
            System.out.println("1 != 3");
        if (strOb1.equals(strOb4))
            System.out.println("1 == 4");
        else
            System.out.println("1 != 4");

        if (strOb1==strOb2)
            System.out.println("Равенство ссылок: 1 == 2");
        else
            System.out.println("Равенство ссылок: 1 != 2");

        if (strOb1==strOb3)
            System.out.println("Равенство ссылок: 1 == 3");
        else
            System.out.println("Равенство ссылок: 1 != 3");

        if (strOb1==strOb4)
            System.out.println("Равенство ссылок: 1 == 4");
        else
            System.out.println("Равенство ссылок: 1 != 4");
    }

}
