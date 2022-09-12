package src.main.java.com.IlonaA.javacore.Patterns.Decorator;

public class Storekeeper extends SellerDecorator{
    public Storekeeper(SellerI sellerI) {
        super(sellerI);
    }
public String spread(){
        return " раскладывает товар";
}
    @Override
    public String sell() {
        return super.sell()+spread();
    }
}
