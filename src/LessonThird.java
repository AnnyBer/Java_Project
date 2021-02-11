import java.util.Random;
import java.util.Scanner;

public class LessonThird {

    public static char [][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static char manDot = 'X';
    public static char compDot = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void createField() {
        fieldSizeY = 3;
        fieldSizeX = 3;
        field = new char [fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void printField() {
        System.out.println("******************");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }
        System.out.println("******************");
    }

    public static boolean isValidCell(int y, int x) {
        return x < 0 || x >= fieldSizeX || y < 0 || y >= fieldSizeY;
    }

    public static boolean isEmptyCell(int y, int x) {
        return field[y][x] == empty;
    }


    public static void manTurn () {
        int x;
        int y;
        do {
            System.out.println("Ваш ход! Введите координаты хода (1, 2, 3)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (isValidCell(y, x) || isEmptyCell(y, x));
        field[x][y] = manDot;
    }

    public static void compTurn () {
        int x;
        int y;
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (isEmptyCell(y, x));
        field[x][y] = compDot;
    }

    public static boolean checkWin (char currentPlayer) {
        for (int i = 0; i < fieldSizeX; i++) {
            if ((field[i][0] == currentPlayer && field[i][1] == currentPlayer && field[i][2] == currentPlayer) ||
                    (field[0][i] == currentPlayer && field[1][i] == currentPlayer && field[2][i] == currentPlayer)) {
                return true;
            }
            if ((field[0][0] == currentPlayer && field[1][1] == currentPlayer && field[2][2] == currentPlayer) ||
                    (field[2][0] == currentPlayer && field[2][2] == currentPlayer && field[0][2] == currentPlayer)) {
                return true;
            }
        }
        return false;
    }

    public static boolean fullField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == empty) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        createField();
        printField();
        while (true) {
            manTurn();
            printField();
            if (checkWin(manDot)) {
                System.out.println("Победитель Man!");
                break;
            }
            if (fullField()) {
                System.out.println("Победила дружба!");
                break;
            }

            compTurn();
            printField();
            if (checkWin(compDot)) {
                System.out.println("Победитель Computer!");
                break;
            }
            if (fullField()) {
                System.out.println("Победила дружба!");
                break;
            }
        }
        System.out.println("Finish");
    }
}
