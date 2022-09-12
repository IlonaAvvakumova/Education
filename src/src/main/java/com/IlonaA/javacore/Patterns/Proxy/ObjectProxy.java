package src.main.java.com.IlonaA.javacore.Patterns.Proxy;

public class ObjectProxy implements ProxySubject{
private Site site;
ObjectProxy(Site site){
    this.site = site;
}

    @Override
    public void viewSite() {
protectedChanel();
        site.viewSite();
    }

    void protectedChanel(){
        if(site == null){
            site = new Site();
            System.out.println(site);
            System.out.println("Вы используете безопасное соединение");
        }
        else{
            System.out.println(site);
            System.out.println("Вы используете не безопасное соединение");}
    }
}
