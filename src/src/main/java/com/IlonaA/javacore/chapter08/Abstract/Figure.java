package src.main.java.com.IlonaA.javacore.chapter08.Abstract;

abstract class Figure {
    double dim1;
    double dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area(); // абстрактный метод, не обязателен
}
class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    //переопределить метод area() для прямоугольника
    double area(){
        System.out.println("В области прямоугольника.");
        return dim1*dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b){
        super(a,b);
    }
    //переопределить метод area() для треугольника
    double area(){
        System.out.println("В области треугольника");
        return dim1*dim2/2;
    }
}
class AbstractAreas {
    public static void main(String[] args) {
//Figure f = new Figure(); недопустимо создавать объект абстрактного класса
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure f; // запись верна, объект не создан

        f = r;
        System.out.println("Площадь равна " + f.area()); //вызов метода, не смотря на то что переменная абстрактного класса
        f = t;
        System.out.println("Площадь равна " + f.area());

    }
}

