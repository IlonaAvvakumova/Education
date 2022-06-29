package src.main.java.com.IlonaA.javacore;

import java.util.Objects;

public class Car {
    StringBuilder color;
    StringBuilder engine;

    Car(StringBuilder color, StringBuilder engine) {
        this.color = color;
        this.engine = engine;
    }

public boolean equals1111(Car c){

    return (color.equals(c.color) && engine.equals(c.engine));
}

    public static void main(String[] args) {
       Car c1 = new Car(new StringBuilder("red") , new StringBuilder("v4"));
        Car c2 = new Car(new StringBuilder("red") , new StringBuilder("v4"));
          System.out.println(c1.equals1111(c2));

    }
}

/*    public boolean equals(Object obj) {
            if (obj instanceof Car) {
                Car c2 = (Car) obj;
                return (color.equals(c2.color) && engine.equals(c2.engine));
            } else {
                return false;
            }
        }*/
