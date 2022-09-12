package src.main.java.com.IlonaA.javacore.Patterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Pochtamp implements Pochta{
    Human human;
    List<Human> list = new ArrayList();

  public void addPeople(Human human){
      list.add(human);
    }
    @Override
    public void sendLetters(String letter, Human sender) {
        for (Human h:list
             ) {
            if(h != sender)
                h.getLetters(letter);
        }
    }
}
