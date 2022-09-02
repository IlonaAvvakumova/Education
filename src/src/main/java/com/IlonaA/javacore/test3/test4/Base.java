package src.main.java.com.IlonaA.javacore.test3.test4;

public class Base {
    static {
        System.out.println("Static");
    }
    public Base(String s){
        System.out.println("Base " +s);
    }
}

class Sub extends Base{
    private static final String Str = "Constructor"; // поле обязательно должно быть статик
    public Sub(){
        super(Str);
        System.out.println("Sub " + Str);
    }

    public static void main(String[] args) {
        Base B = new Sub();
    }
}
