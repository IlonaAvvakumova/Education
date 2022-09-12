package src.main.java.com.IlonaA.javacore.Patterns.Proxy;

public class Site implements ProxySubject{
    @Override
    public void viewSite() {
        System.out.println("Вы читаете страницу сайта");
    }
}
