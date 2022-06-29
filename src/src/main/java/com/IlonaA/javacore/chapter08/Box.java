package src.main.java.com.IlonaA.javacore.chapter08;

public class Box {
    double width;
    double height;
    double depth;
    int a = 1000;

    //сконструтировать клон объекта и передать объект конструктору
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //конструктор применяемый в отсутствии размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //метод расчет и возврата объема
    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }

    BoxWeight() {
      super();
    }
}

class ColorBox extends BoxWeight {
    int color;

    ColorBox(double w, double h, double d, double m, int c) {
        super(w, h, d, m); //вызвать конструктор супер класса, указать параметры его контруктора
        color = c;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 5);
        BoxWeight my = new BoxWeight();
        System.out.println(my.weight + " " + my.depth);
        Box mybox3 = new Box(2, 3, 4);
        Box test = new Box(mybox3);
        double b = test.a;
        System.out.println(b);
        double vol;
        vol = mybox1.volume();
        System.out.println("объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);

        ColorBox e = new ColorBox(10.1, 20, 30, 40.2, 1);
//RefDemo:
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol1;
        vol1 = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol1);
        System.out.println("Вес weightbox равен " + weightbox);
        System.out.println();

        plainbox = weightbox;
        vol1 = plainbox.volume(); //метод volume определен в классе Box
        System.out.println("Объем plainbox равен " + vol1);
        //  System.out.println( plainbox.weight + weightbox.weight);
        //  plainbox.weight не видена переменная weight так как тип переменной plainbox остается Box
    }
}

