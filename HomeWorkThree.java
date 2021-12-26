/*
 * Java 1. Work 3.
 *
 *@author Matafonova Oksana
 *@version 16.12.2021
 */
import java.util.Arrays;

class HomeWorkThree {
    public static void main(String[]args) {
        isArr100();
        isArr0101();
        isArrSixOn2();
        pastOneInDiagonal();
        isArrReturn(5, 7);

    }
    static void isArr0101() {
        int[]arrOne = {
            0,
            1,
            1,
            1,
            0,
            0,
            0,
            1
        };
        System.out.println(Arrays.toString(arrOne));

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 0) {
                arrOne[i] = arrOne[i] + 1;
            } else if (arrOne[i] == 1) {
                arrOne[i] = arrOne[i] - 1;
            }
        }
        System.out.println(Arrays.toString(arrOne));
    }

    static void isArr100() {
        int[]arrTwo = new int[100];
        int i = 0;
        int k = 1;
        for (i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = k;
            k++;
        }
        System.out.println(Arrays.toString(arrTwo));
    }

    static void isArrSixOn2() {
        int[]arrThree = {
            1,
            5,
            3,
            2,
            11,
            4,
            5,
            2,
            4,
            8,
            9,
            1
        };
        System.out.println(Arrays.toString(arrThree));
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] = arrThree[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }
    static void pastOneInDiagonal() {
        int[][]arrDouble = new int[5][5];
        int i,
        j;
        for (i = 0; i < 5; i++)
            for (j = 0; j < 5; j++) {
                if (i == j) {
                    arrDouble[i][j] = 1;
                }
            }
        System.out.println(Arrays.deepToString(arrDouble));
    }
    static int[]isArrReturn(int len, int initialValue) {
        int[]arrFive = new int[len];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = initialValue;
        }
        return arrFive;
    }
}
