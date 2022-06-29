package src.main.java.com.IlonaA.javacore.chapter06;

public class BoxDemo7 {
    public static void main(String[] args) {
       /* Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9); */
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("объем равен " + vol);
    }
}
class Box {
    double width;
    double height;
    double depth;
 /*   Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }*/
    Box(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume(){
        return width*height*depth;
    }
}
