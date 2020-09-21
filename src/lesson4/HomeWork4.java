package lesson4;


import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static final int SIZE = 6;
    public static final int DOTS_TO_WIN = 4;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_USER = 'X';
    public static final char DOT_AI = '0';
    public static int emptyDots = SIZE * SIZE;

    public static final String EMPTY = " ";
    public static final String EMPTY_DOUBLE = "  ";

    public static Scanner scanner = new Scanner(System.in);
    public static char[][] field = new char[SIZE][SIZE];
    public static Random rand = new Random();

    public static void main(String[] args) {
        turnGame();
        checkTurnGame();

    }


    private static void turnGame() {
        initField();
        printField();
    }


    private static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        printFieldHeader();
        printFieldRow();
    }

    private static void printFieldHeader() {
        System.out.print(EMPTY_DOUBLE);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();
    }

    private static void printFieldRow() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + EMPTY);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + EMPTY);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void checkTurnGame() {
        int checkTurn = new Random().nextInt(2) + 1;
        System.out.println("Определим кто будет ходить первым. Человек или машина. Угадайте: 1 или 2?");
        int inputNumber = scanner.nextInt();
        if (inputNumber == checkTurn) {
            playGame1();
        } else playGame2();
    }

    private static void playGame1() {
        while (true) {
            System.out.println("Угадали!!!");
            humanTurn();

            printField();
            if (checkEnd(DOT_USER)) {
                System.exit(0);
            }
            aiTurn();
            printField();
            if (checkEnd(DOT_AI)) {
                System.exit(0);
            }
        }
    }

    private static void playGame2() {
        while (true) {
            System.out.println("Не угадали...");
            aiTurn();

            printField();
            if (checkEnd(DOT_USER)) {
                System.exit(0);
            }

            humanTurn();
            printField();
            if (checkEnd(DOT_AI)) {
                System.exit(0);
            }
        }

    }

    private static void humanTurn() {
        int rowNumber, columnNumber;
        System.out.println("Ходит человек...");
        do {
            System.out.print("Строка: ");
            rowNumber = scanner.nextInt() - 1;
            System.out.print("Столбец: ");
            columnNumber = scanner.nextInt() - 1;
        } while (!isValidField(rowNumber, columnNumber));
        field[rowNumber][columnNumber] = DOT_USER;
    }

    private static boolean isValidField(int rowNumber, int columnNumber, boolean isAi) {
        if (!isAi && ((rowNumber < 0) || (rowNumber > SIZE - 1) || (columnNumber < 0) || (columnNumber > SIZE - 1))) {
            System.out.println("\nНеправильный ввод");
            return false;
        }
        if (field[rowNumber][columnNumber] != DOT_EMPTY) {
            if (!isAi)
                System.out.println("\nЯчейка занята!!!");
            return false;
        }
        return true;
    }

    private static boolean checkEnd(char symbol) {

        if (checkWin(symbol)) {

            if (symbol == DOT_USER) {
                System.out.println("Вы победили!!! Поздравляем");
            }
            if (symbol == DOT_AI) {
                System.out.println("Машина победила...");
            }
            return true;

        }
        if (isMapFull()) {
            System.out.println("Игра окончена. Ничья. Все ячейки заполнены");
            return true;
        }
        return false;
    }


    private static boolean checkWin(char symbol) {
        if (checkRow(symbol)) {
            return true;
        }
        if (checkColumn(symbol)) {
            return true;
        }
        if (checkDiagonals(symbol)) {
            return true;
        }
        return false;
    }

    private static boolean checkRow(char symbol) {


        for (int i = 0; i < SIZE; i++) {
            int winSymbolCount = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == symbol) {
                    winSymbolCount++;
                } else winSymbolCount = 0;
                if (winSymbolCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkColumn(char symbol) {

        for (int i = 0; i < SIZE; i++) {
            int winSymbolCount = 0;
            for (int j = 0; j < SIZE; j++) {
                if (field[j][i] == symbol) {
                    winSymbolCount++;
                } else winSymbolCount = 0;
                if (winSymbolCount == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonals(char symbol) {
        if (checkFirstDiagonal(symbol)) {
            return true;
        }
        if (checkSecondDiagonal(symbol)) {
            return true;
        }
        if (checkFirstSideDiagonal(symbol)) {
            return true;
        }
        if (checkSecondSideDiagonal(symbol)) {
            return true;
        }

        return false;
    }

    private static boolean checkFirstDiagonal(char symbol) {
        int winSymbolCount = 0;
        for (int i = 0, j = 0; i < SIZE; i++) {
            if (field[i][j] == symbol) {
                winSymbolCount++;
                j++;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }

        return false;
    }

    private static boolean checkSecondDiagonal(char symbol) {
        int winSymbolCount = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++) {
            if (field[i][j] == symbol) {
                winSymbolCount++;
                j--;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkFirstSideDiagonal(char symbol) {
        int winSymbolCount = 0;
        for (int i = 0, j = 1; i < SIZE; i++) {
            if (field[i][j] == symbol) {
                winSymbolCount++;
                j++;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 0, j = 1; j < SIZE; j++) {

            if (field[i][j] == symbol) {
                winSymbolCount++;
                i++;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkSecondSideDiagonal(char symbol) {
        int winSymbolCount = 0;
        for (int i = 1, j = SIZE - 1; i < SIZE; i++) {
            if (field[i][j] == symbol) {
                winSymbolCount++;
                j--;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }
        for (int i = 0, j = SIZE - 2; j >= 0; j--) {
            if (field[i][j] == symbol) {
                winSymbolCount++;
                i++;
            } else winSymbolCount = 0;
            if (winSymbolCount == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }


    private static boolean isMapFull() {
        emptyDots--;
        if (emptyDots == 0)
            return true;
        else return false;
    }

    private static void aiTurn() {
        System.out.println("Ходит машина...");
        int rowNumber = 0;
        int columnNumber = 0;
        boolean aiWin = false;
        boolean humanWin = false;

        if (!aiWin) {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (isValidField(i, j)) {
                        field[i][j] = DOT_USER;
                        if (checkWin(DOT_USER)) {
                            rowNumber = i;
                            columnNumber = j;
                            humanWin = true;
                        }
                        field[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        if (!aiWin && !humanWin) {
            do {
                rowNumber = rand.nextInt(SIZE);
                columnNumber = rand.nextInt(SIZE);
            } while (!isValidField(rowNumber, columnNumber, true));
        }
        field[rowNumber][columnNumber] = DOT_AI;
    }

    private static boolean isValidField(int rowNumber, int columnNumber) {
        return isValidField(rowNumber, columnNumber, false);
    }
}
