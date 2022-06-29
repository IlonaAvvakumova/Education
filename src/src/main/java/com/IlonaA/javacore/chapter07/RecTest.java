package src.main.java.com.IlonaA.javacore.chapter07;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    } // конструктор в котором придается размер массива values

    void printArray(int i) {

        if (i == 0) return; // выход из рекурсии

        else printArray(i - 1);//при каждом вызове метода на экран выводится элемент индекса массива
        System.out.println("[" + (i - 1) + "]" + values[i - 1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);//создает массив размером 10
        int i;
        for (i = 0; i < 10; i++)
            ob.values[i] = i; // заполнение массива данными
        ob.printArray(10); // вызывается рекурсионный метод вывода на экран массива
    }

}
