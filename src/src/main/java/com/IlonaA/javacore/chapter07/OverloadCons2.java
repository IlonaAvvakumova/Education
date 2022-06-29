package src.main.java.com.IlonaA.javacore.chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        Boxx mybox1 = new Boxx(10,20,15);
        Boxx mybox2 = new Boxx();
        Boxx mycube = new Boxx(7);
        Boxx myclone = new Boxx(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен" + vol);
        vol=mycube.volume();
        System.out.println("объем куба равен " + vol);
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}
 class Boxx{
    double width;
    double height;
    double depth;
    Boxx(Boxx ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    Boxx(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    Boxx(){
        width = -1;
        height = -1;
        depth = -1;
    }
    Boxx(double len){
        width=height=depth=len;
    }
    double volume(){
        return width*height*depth;
    }

}
