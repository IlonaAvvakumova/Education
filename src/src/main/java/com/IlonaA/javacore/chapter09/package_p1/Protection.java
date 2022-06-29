package src.main.java.com.IlonaA.javacore.chapter09.package_p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;
    public Protection(){
        System.out.println("конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
class Derived extends Protection{
    Derived(){
        System.out.println("конструктор подкласса");
        System.out.println("n = " + n);
      //доступно только для своего класса  System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
class SamePackage{
    SamePackage(){
        Protection p = new Protection(); // необходимо делать объект класса для обращения к переменным
        System.out.println("конструктор этого же пакета");
        System.out.println("n = " + p.n);
    //доступно только для своего класса    System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}