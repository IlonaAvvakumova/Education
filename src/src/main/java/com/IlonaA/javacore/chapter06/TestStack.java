package src.main.java.com.IlonaA.javacore.chapter06;
public class TestStack{
    public static void main(String[] args) {
Stack mystack1 = new Stack();
Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Содержимое стека mystack1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack1.pop() +" ");
        }
        System.out.println();
        System.out.println("Содержимое стека mystack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(mystack2.pop() + " ");
        }
    }
}

class Stack {
int stck[] = new int[10];
int tos;
Stack(){
    tos = -1;
}
void push(int item){
    if(tos==9)
        System.out.println("Стек заполнен");
    else
        stck[++tos] = item;
}
int pop(){
    if(tos<0){
        System.out.println("Стек не загружен");
        return 0;
    }
    else
        return stck[tos--];
}
}

