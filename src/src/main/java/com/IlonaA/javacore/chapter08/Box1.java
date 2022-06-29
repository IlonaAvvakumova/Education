package src.main.java.com.IlonaA.javacore.chapter08;

public class Box1 {
  private   double width;
  private   double height;
  private   double depth;

    //сконструтировать клон объекта и передать объект конструктору
    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //конструктор применяемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //конструктор применяемый в отсутствии размеров
    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }
    //конструктор применяемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }
    //метод расчет и возврата объема
    double volume() {
        return width * height * depth;
    }
}
class BoxWeight1 extends Box1 {
    double weight;
    //сконструировать клон объекта
  /*  BoxWeight1(Box1 ob){
        super(ob);
        weight=ob.weight; // не видно этой переменной
    }*/
    BoxWeight1(BoxWeight1 ob){
        super(ob);
        weight=ob.weight;}

    BoxWeight1(double w, double h, double d, double m) {
       super(w,h,d);
       weight =m;
    }
    BoxWeight1(){
       super();
        weight = -1;
    }
    BoxWeight1(double len, double m){
        super();
        weight = m;
    }
}
class DemoSuper{
    public static void main(String[] args) {
        BoxWeight1 box1 = new BoxWeight1(10,20,15,34.3);
        BoxWeight1 box2 = new BoxWeight1(2,3,4,0.076);
        BoxWeight1 box3 = new BoxWeight1();
        BoxWeight1 cube = new BoxWeight1(3,2);
        BoxWeight1 clone = new BoxWeight1(box1);
      double vol;
vol = box1.volume();
        System.out.println("объем box1 равен " + vol);
        System.out.println("Вес box1 равен " + vol);
        System.out.println();
        vol = clone.volume();
        System.out.println("объем clone равен " + vol);
        System.out.println("Вес clone равен " + vol);
        System.out.println();
    }
}

