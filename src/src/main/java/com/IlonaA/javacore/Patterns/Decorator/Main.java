package src.main.java.com.IlonaA.javacore.Patterns.Decorator;

public class Main {


    public static void main(String[] args) {
        SellerI employee =new Seller();
        System.out.println(employee.sell());
        SellerI employee2 = new Storekeeper(new Seller());
        System.out.println(employee2.sell());
        SellerI employee3 = new Manager(new Storekeeper(new Seller()));
        System.out.println(employee3.sell());
    }
}
