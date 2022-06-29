package src.main.java.com.IlonaA.javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol;
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6,9);

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
class Box1{
    double width;
    double heigt;
    double depth;

    double volume (){
        return width*heigt*depth;
    }
    void setDim(double w, double h, double d){
        width = w;
        heigt = h;
        depth = d;
    }
}
