package src.main.java.com.IlonaA.javacore.Patterns.BuilderSetter;

public class Burger {
    private final Bagel bagel; //обязательное поле
    private final int price; //обязательное поле
    private final double weight; //обязательное поле
    private final boolean cucumber;
    private final boolean tomato;
    private final boolean cheese;

    private Burger(BurgerBuilder burgerBuilder) {
        this.bagel = burgerBuilder.bagel;
        this.price = burgerBuilder.price;
        this.weight = burgerBuilder.weight;
        this.cucumber = burgerBuilder.cucumber;
        this.tomato = burgerBuilder.tomato;
        this.cheese = burgerBuilder.cheese;
    }

    public Bagel getBagel() {
        return this.bagel;
    }

    public int getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isCucumber() {
        return this.cucumber;
    }

    public boolean isTomato() {
        return this.tomato;
    }

    public boolean isCheese() {
        return this.cheese;
    }
//внутренний класс Строителя
    public static class BurgerBuilder{
        private  Bagel bagel;
        private  int price;
        private  double weight;
        private  boolean cucumber;
        private  boolean tomato;
        private  boolean cheese;
//конструктор обязательных полей


    public BurgerBuilder(final Bagel bagel, final int price, final double weight) {
        this.bagel = bagel;
        this.price = price;
        this.weight = weight;
    }
    //установка не обязательных полей, создаем методы
    public BurgerBuilder setCucumber(final boolean cucumber){
        this.cucumber = cucumber;
        return this;
    }
    public BurgerBuilder setTomato(final boolean tomato){
        this.tomato = tomato;
        return this;
    }
    public BurgerBuilder setCheese(final boolean cheese){
        this.cheese = cheese;
        return this;
    }
    //создание объекта Бургер с нужными параметрами
    public Burger build(){
        return new Burger(this);
    }
}
}
