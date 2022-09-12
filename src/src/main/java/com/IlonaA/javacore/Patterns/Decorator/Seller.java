package src.main.java.com.IlonaA.javacore.Patterns.Decorator;

public class Seller implements SellerI{


    @Override
    public String sell() {
        return "продает яблочки ";
    }
}
