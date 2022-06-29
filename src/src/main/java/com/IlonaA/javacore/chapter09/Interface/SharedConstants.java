package src.main.java.com.IlonaA.javacore.chapter09.Interface;

import java.util.Random;

public interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}
class Question implements SharedConstants{
    Random rand = new Random(); //метод из стандартной библиотеки JAVA

    int ask(){
        int prob = (int) (100*rand.nextDouble());
        if(prob <30)
            return NO;
        else if (prob<60)
            return YES;
        else if (prob<75)
            return LATER;
        else if (prob<98)
            return SOON;
        else
            return NEVER;
    }
}
class AskMe implements SharedConstants{
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("Net");
                break;
            case YES:
                System.out.println("Da");
                break;
            case MAYBE:
                System.out.println("Vozmozno");
                break;
            case LATER:
                System.out.println("Pozdnee");
                break;
            case SOON:
                System.out.println("Vscore");
                break;
            case NEVER:
                System.out.println("Nicogda");
                break;

        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}