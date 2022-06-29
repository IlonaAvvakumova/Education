package src.main.java.com.IlonaA.javacore.chapter07;

public class RetOb {
    public static void main(String[] args) {
        Tes ob1 = new Tes(2);
        Tes ob2;
        ob2=ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2=ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения значения: " + ob2.a);
    }
}
class Tes {
    int a;
    Tes(int i){
        a = i;
    }
    Tes incrByTen(){
        Tes temp = new Tes(a+10);
        return temp;
    }
}
