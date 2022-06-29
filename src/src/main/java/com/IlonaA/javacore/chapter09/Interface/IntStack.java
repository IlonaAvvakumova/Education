package src.main.java.com.IlonaA.javacore.chapter09.Interface;

public interface IntStack {
    void push(int item);
    int pop();
}
//реализация интерфейса  IntStack для стека фиксированного размера
class FixedStack implements IntStack{
    private int stck[];
    private int tos;
    //выделить память и инициализировать стек
    FixedStack(int size){
        stck = new int [size];
        tos = -1;
    }
    //разместить элемент в стеке
    public void push(int item) {
        if (tos==stck.length-1)
            System.out.println("Стек заполнен");
        else
           stck[++tos] = item;
    }
    //извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}
class IFTest{
    public static void main(String[] args) {
        FixedStack stack1 = new FixedStack(5);
        FixedStack stack2 = new FixedStack(8);
        //разместить числа в стеке
        for (int i = 0; i<5; i++) stack1.push(i);
        for (int i = 0; i<8; i++) stack2.push(i);
        //извлечь эти числа из стек
        System.out.println("Стек в stack1: ");
        for (int i = 0; i<5; i++) stack1.pop();
        System.out.println("Стек в stack2: ");
        for (int i = 0; i<8; i++) stack2.pop();
    }
}