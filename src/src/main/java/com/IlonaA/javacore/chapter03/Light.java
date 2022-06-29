package src.main.java.com.IlonaA.javacore.chapter03;

public class Light {
    public static void main(String[] args) {
int lightspeed;
long days;
long seconds;
long distance;

lightspeed = 186000;
days = 10000000000000L;
seconds = days * 24 * 60 *60;
distance = lightspeed * seconds;
        System.out.println(" Za " + days);
        System.out.println(" days light proidet okolo ");
        System.out.println(distance + "mill.");

    }
}
