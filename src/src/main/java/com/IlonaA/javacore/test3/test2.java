package src.main.java.com.IlonaA.javacore.test3;


public class test2 {
    public static void main(String[] args) {
     Vehicle vehicle = new Bike();
    Carr b = (Carr) vehicle;
        vehicle.printSound();
        b.printSound();


    }}
class Vehicle {
    public void printSound(){
        System.out.println("vehicle");
    }
}
class Carr extends Vehicle{
   public  void  printSound(){
       System.out.println("car");
   }
}
class Bike extends Carr{
    public  void  printSound(){
        System.out.println("bike");
    }
}
