package src.main.java.com.IlonaA.javacore.Patterns.Decorator;

public class Manager extends SellerDecorator{
    public Manager(SellerI sellerI) {
        super(sellerI);
    }
    public String manage(){
        return " и управляет магазином";
    }

    @Override
    public String sell() {
        return super.sell() + manage();
    }
}
