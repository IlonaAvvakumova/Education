package src.main.java.com.IlonaA.javacore.chapter08.Overriding;

public class Figure {
    double dim1;
    double dim2;
    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    double area(){
        System.out.println("Площадь фигуры не определена");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }
    //переопределить метод area() для прямоугольника
    double area(){
        System.out.println("В области прямоугольника.");
        return dim1*dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a,b);
    }
    //переопределить метод area() для треугольника
    double area(){
        System.out.println("В области треугольника");
        return dim1*dim2/2;
    }
}
class FindAreas{
    public static void main(String[] args) {
        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figure;

        figure = r;
        System.out.println("Площадь равна " + figure.area());
        figure = t;
        System.out.println("Площадь равна " + figure.area());
        figure = f;
        System.out.println("Площадь равна " + figure.area());




    }
}
