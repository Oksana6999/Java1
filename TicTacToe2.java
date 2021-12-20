/*
*Java 1. Work 4.
*
*@author Matafonova Oksana
*@version 20.12.2021
*
*
*/
import java.util.Scanner;
import java.util.Random;

class TicTacToe2 {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][]table;
    Scanner sc;
    Random random;

    public static void main(String[]args) {
        new TicTacToe().game();

    }
    TicTacToe2() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }
    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("You win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, it is Draw.");
                break;
            }
            turnAI();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("AI win!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, it is Draw.");
                break;
            }
        }
        printTable();
    }
    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }
    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    }
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1...3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_X;
    }
    void turnAI() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    boolean isWin(char ch) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == ch && table[i][1] == ch && table[i][2] == ch) ||
                (table[0][i] == ch && table[1][i] == ch && table[2][i] == ch)) return true;
            if ((table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) ||
            (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch)) return true;
        return false;
    }
    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
