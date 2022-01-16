/*
 * Java 1. Work 2.
 *
 *@author Matafonova Oksana
 *@version 14.12.2021
 */
class HomeWorkTwo {
    public static void main(String[]args) {
        System.out.println(checkSum10from20(-10, 25));
        System.out.println(checkSum10from20(10, 10));
        checkNumberPlusMinus(-3);
        checkNumberPlusMinus(7);
        System.out.println(checkNumberPositiveNegative(-2));
        System.out.println(checkNumberPositiveNegative(9));
        printString(4, "Hello"); ;
    }

    static boolean checkSum10from20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void checkNumberPlusMinus(int a) {
        System.out.println(a >= 0 ? "Number is positive" : "Number is negative");
    }

    static boolean checkNumberPositiveNegative(int a) {
        return (a <= 0);
    }

    static void printString(int a, String message) {
        for (int i = a; i > 0; i--) {
            System.out.println(message);
        }
    }
}
