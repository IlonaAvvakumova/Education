package src.main.java.com.IlonaA.javacore.chapter15;
//(::) - ссылка на статический метод.  имя_класса::имя_метода
//Продемонстрировать ссылку на статический метод
//Функциональный интерфейс для операции с символьными строками
interface StringF {
    String func(String n);
}
// В этом интерфейсе определеяется статический метод strReverse()
 class MyStringOps1 {
    //Статический метод изменяющий порядок следования символов в строке
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);

        return result;
    }
}
class MethodRefDemo{
    //В этом методе функциональный интерфейс указывает в качестве типа первого его параметра.
    //Следовательно ему может быть передан любой экземпляр этого интерфейса включая и ссылку на метод
    static String stringOp(StringF sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;
        //Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps1 :: strReverse, inStr);
        System.out.println("Исходная строка:  " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}