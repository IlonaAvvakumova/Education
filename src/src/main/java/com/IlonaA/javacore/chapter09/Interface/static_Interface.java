package src.main.java.com.IlonaA.javacore.chapter09.Interface;

public interface static_Interface {
    static int getDefaultNumber(){
        return 0;
    }
}
class Test_static{
    public static void main(String[] args) {
        int test = static_Interface.getDefaultNumber();
        //вызывать статические методы интерфейсов можно напрямую, без создания объектов
        //статический метод интерфейса не наследуется ни классами ни интерфейсами
        System.out.println(test);
    }

}
//Вложенные в интерфейсы классы.
//Вложенный (nested) в интерфейс класс является открытым (public) и статическим (static) даже
//без явного указания этих модификаторов. Помещая класс внутрь интерфейса, мы показываем,
//что он является неотъемлемой частью API этого интерфейса и более нигде не используется.
//Самым, наверное, известным примером этой идиомы является класс Map.Entry<K, V>,
// содержащий пары ключ-значение ассоциативного словаря.
interface Colorable {

    public Color getColor();

   static class Color {
       int a =10;
        private int red, green, blue;
        Color(int red, int green, int blue) {
            this.red   = red;
            this.green = green;
            this.blue  = blue;
        }
       int getRed() {
            return red;
        }
        int getGreen() {
            return green;
        }
        int getBlue() {
            return blue;
        }
    }
}

  class Triangle implements Colorable {

    private  Color color;

       // ...

    @Override
    public Color getColor() {
        return color;
    }
    public static void main(String[] args) {
        //интерфейс.вложенные класс
        Colorable.Color color = new Colorable.Color(0, 0, 0);
        int b=color.a; //есть доступ в переменную класса, кроме переменных private
        System.out.println(color.getGreen());
        System.out.println(b);
                     //класс реализатор интерфейса.класс в интерфейсе
        color = new Triangle.Color(255, 255, 255);


    }
}

