package src.main.java.com.IlonaA.javacore.chapter09.Interface;

public interface default_Inteface {
    int getNumber(); // необходимо всегда реализовывать в классе
    default String getString(){ // не обязательно реализовывыть, можно сразу вызывать метод
        return "объект типа String по умолчанию";
    }
}
class MyIFIm implements default_Inteface{
    public int getNumber(){
        return 100;
    }
    //не обязательно вызывать getString
    class MyIFm implements default_Inteface{
        public int getNumber(){
            return 100;
        }
        public String getString(){
            return "Это другая символьная строка";//перезаписываем метод интерфейса по умолчанию
        }
    }
}
class DefaultMethodDemo{
    public static void main(String[] args) {
        MyIFIm ob = new MyIFIm();
        System.out.println(ob.getString());
        System.out.println(ob.getNumber());
    }
}