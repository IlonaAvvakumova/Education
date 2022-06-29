package src.main.java.com.IlonaA.javacore.chapter08;

public class Boxx {
    private   double width;
    private   double height;
    private   double depth;

    //сконструтировать клон объекта и передать объект конструктору
    Boxx(Boxx ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    //конструктор применяемый при указании всех размеров
    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    //конструктор применяемый в отсутствии размеров
    Boxx() {
        width = -1;
        height = -1;
        depth = -1;
    }
    //конструктор применяемый при создании куба
    Boxx(double len) {
        width = height = depth = len;
    }
    //метод расчет и возврата объема
    double volume() {
        return width * height * depth;
    }
}
class BoxWeightx extends Boxx {
    double weight;
    //сконструировать клон объекта
    BoxWeightx(BoxWeightx ob){
        super(ob);
        weight=ob.weight;}

    BoxWeightx(double w, double h, double d, double m) {
        super(w,h,d);
        weight =m;
    }
    BoxWeightx(){
        super();
        weight = -1;
    }
    BoxWeightx(double len, double m){
        super();
        weight = m;
    }
}
//добавить поле стоимости доставки
class Shipment extends BoxWeightx{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c){
        super(w,h,d,m);
        cost = c;
    }
    Shipment(){
        super();
        cost = -1;
    }
    Shipment(double len, double m, double c){
        super(len,m);
        cost = c;
    }
}
class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.14);
        Shipment shipment2 =new Shipment(2,3,4,0.76,1.28);
        Shipment shipment = new Shipment(shipment1);
       double vol;
       vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }
}