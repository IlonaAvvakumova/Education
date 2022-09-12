package src.main.java.com.IlonaA.javacore.Patterns.Proxy;

public class Main {
    public static void main(String[] args) {
        Site site=null;
        ProxySubject pr = new ObjectProxy(site);
        pr.viewSite();
        System.out.println("------------------------------------");
site =new Site();
pr= new ObjectProxy(site);
pr.viewSite();
    }
}
