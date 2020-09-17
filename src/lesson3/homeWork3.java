package lesson3;

import java.util.Random;
import java.util.Scanner;

public class homeWork3 {

    private static Scanner in = new Scanner(System.in);
    public static final int MAX_COUNT = 3;

    public static void main(String[] args) {

        while (true) {
            guessingGame();
            doExit();
        }
    }

    private static void guessingGame() {
        int randomNumber = new Random().nextInt(8);
        System.out.println("Введите число от 0 до 9");

        for (int tryCount = 0; tryCount <= MAX_COUNT; tryCount++) {
            if(tryCount == MAX_COUNT){
                System.out.println("Вы проиграли. Загаданное число: " + randomNumber);
                break;
            }
            int inputNumber = in.nextInt();
            if (inputNumber == randomNumber) {
                System.out.println("Поздравляем!!! Вы угадали! Это число: " + randomNumber);
                break;
            } else if (inputNumber < randomNumber) {
                System.out.println("Неверно. Загаданное число больше");
            } else if (inputNumber > randomNumber) {
                System.out.println("Неверно. Загаданное число меньше");
            }
        }
    }

    public static void doExit() {
        System.out.println("Хотите выйти? да(1)/нет(0)");
        if (in.next().equals("1")) {
            System.exit(0);
        }
    }
}
