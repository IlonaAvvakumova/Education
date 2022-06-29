package src.main.java.com.IlonaA.javacore.chapter05;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
           switch (i){
               case 0:
                   System.out.println("i равно нулю.");
                   break;
                   case 1:
                   System.out.println("i равно единице.");
                   break;
                   case 2:
                   System.out.println("i равно двойке.");
                   break;
                   case 3:
                   System.out.println("i равно тройке.");
                   break;
               default:
                   System.out.println("i больше трех");
           }
        }
    }
}
