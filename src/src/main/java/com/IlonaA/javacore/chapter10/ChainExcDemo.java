package src.main.java.com.IlonaA.javacore.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        //создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");
        //добавить причину исключения
        e.initCause(new ArithmeticException("причина")); //связывает причину исключения с вызывающим исключением и возращает ссылку на исключение
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            //вывести исключение верхнего уровня
            System.out.println("перехвачено исключение : " + e);
            //вывести исключение послужившее причиной для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());//возвращает исключение вызывающее текущее исключение

        }
    }
}
