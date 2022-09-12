package src.main.java.com.IlonaA.javacore.Patterns.Decorator;

public class SellerDecorator implements SellerI {
    SellerI sellerI;

     SellerDecorator(SellerI sellerI) {
        this.sellerI = sellerI;
    }

    @Override
    public String sell() {
        return sellerI.sell();
    }
}
