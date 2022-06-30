package src.main.java.com.IlonaA.javacore.myGames;

import java.util.Scanner;
/*	Создать консольное приложение - эмулятор игры “Камень-Ножницы-Бумага”. Забронировать код на code rewie .

        Классы (минимально необходимые):

        Field - сущность, описывающая игровое поле
        GameLogic - содержит бизнес-логику игры
        GameRunner - главный класс приложения, содержащий метод main*/
// String title = scanner.nextLine();

public class GameRunner {

    public static void main(String[] args) {

        System.out.println(GameLogic.vibor());
    }
}

class GameLogic {

    static String vibor() {
System.out.println("Пожалуйста введите число: "+"\n"+ "1-камень ✊"+"\n"+"2-ножницы ✌"+"\n"+"3-бумага ✋");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выбор первого игрока ");
       int choice1 = scanner.nextInt();
        if (3 < choice1 | choice1 < 1)
            return "Вы ввели не верное число. Игра закончена";

        System.out.println("Выбор второго игрока ");
        int choice2 = scanner.nextInt();
        if (3 < choice2 | choice2 < 1)
            return "Вы ввели не верное число. Игра закончена ☠ ☠ ☠";

        if (choice1 == choice2) {
            System.out.println("Ничья, ваш противник выбрал такой же элемент");
            return zelanie();

        } else if (choice1 == 1 && choice2 == 2 || choice1 == 2 && choice2 == 3 || choice1 == 3 && choice2 == 1) {
            System.out.println("Выиграл первый игрок");
            return zelanie();
        } else
            System.out.println("Выиграл второй игрок");
        return zelanie();

    }

    static String zelanie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println('❤'+""+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤'+""+'❤');
        System.out.println("Хотите продолжить игру? Напишите: Да или Нет");
        String title = scanner.nextLine();
        if (title.equalsIgnoreCase("Да")) return vibor();
        else return "Игра закончена ";
    }


}