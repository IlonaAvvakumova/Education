package src.main.java.com.IlonaA.javacore.Patterns.BuilderSetter;

public class Main {
    //создаем бургер без сыра, и не добавляем томат
    Burger hamburger = new Burger.BurgerBuilder(Bagel.KUNZUT, 200,10.6).setCucumber(true).setTomato(false).build();
    //создаем бургер только с сыром
    Burger cheeseburger = new Burger.BurgerBuilder(Bagel.KOROCHKA, 150,9.2).setCheese(true).build();
    //спецзаказ
    Burger sovsemNeBurger = new Burger.BurgerBuilder(Bagel.LAVASH,350,20.1).setCucumber(true).setCucumber(true).build();


}
