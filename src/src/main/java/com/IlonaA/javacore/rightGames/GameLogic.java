package src.main.java.com.IlonaA.javacore.rightGames;

import java.util.Scanner;

public class GameLogic {
    private final Scanner scanner = new Scanner(System.in); //делаем сканер константой
    private final Field field = new Field(); //создаем прострастранство игры

    public void start() {
        field.setFigure1(getPlayer1Input());
        field.setFigure2(getPlayer2Input());
        String result = checkWinner();
        System.out.println(result);
    }

    private Figure getPlayer1Input() {
        System.out.println("Пожалуйста введите число: " + "\n" + "1-камень ✊" + "\n" + "2-ножницы ✌" + "\n" + "3-бумага ✋");
        System.out.println("Выбор первого игрока ");
        int choice1 = scanner.nextInt();
        while (choice1 < 1 || choice1 > 3) {
            System.out.println("Enter correct input: ");
            choice1 = scanner.nextInt();
        }
        return Figure.getByValue(choice1);
    }

    private Figure getPlayer2Input() {
        System.out.println("Выбор второго игрока ");
        int choice2 = scanner.nextInt();
        while (choice2 < 1 || choice2 > 3) {
            System.out.println("Enter correct input: ");
            choice2 = scanner.nextInt();
        }
        return Figure.getByValue(choice2);
    }

    private String checkWinner() {
        if (field.getFigure1().equals(field.getFigure2()))
            return "Ничья, ваш противник выбрал такой же элемент";
        else if (field.getFigure1() == (Figure.STONE) && field.getFigure2() == (Figure.SCISSORS) || field.getFigure1() == (Figure.SCISSORS) && field.getFigure2() == (Figure.PAPER) ||
        field.getFigure1() == (Figure.PAPER) && field.getFigure2() == (Figure.STONE))
        return "Выиграл первый игрок";
         else
            return "Выиграл второй игрок";

    }
}
