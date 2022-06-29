package src.main.java.com.IlonaA.javacore.chapter09.Interface;

import javax.sound.midi.Soundbank;

//Создать переменную интерфейса и обратится к стекам через нее
public class IFTest3 {
    public static void main(String[] args) {
        IntStack stack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        stack = ds;//загрузить динамический стек
        //разместить числа в стеке
        for (int i = 0; i < 12; i++)
            stack.push(i);

        stack = fs;//загрузить фиксированный стек
        for (int i = 0; i < 8; i++)
            stack.push(i);

        stack = ds;
        System.out.println("Значения в динамическом стеке: ");
        for (int i = 0; i < 12; i++)
            System.out.print(stack.pop() + " ");

        System.out.println();

        stack = fs;
        System.out.println("Значения в фиксированном стеке: ");
        for (int i = 0; i < 8; i++)
            System.out.print(stack.pop() + " ");
    }
}
//переменная stack содержит ссылку на интерфейс InStack. исходя из того на какой объект она ссылается
//выбирается метод push() pop() определенные в реализации интрефейса класса DynStack или FixedStack
//потому что решения принимаются во время выполнения (т.е. по типу класса)