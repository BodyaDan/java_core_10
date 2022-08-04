package fisrt;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = scanner.next();

        System.out.println(checkPalindrom(s));
    }

    public static boolean checkPalindrom(String str) {
        str = str.toLowerCase();
        char [] chars = str.toCharArray();
        /* Шукає середину масиву*/
        int toChar = (chars.length % 2 == 1) ? ((chars.length + 1) / 2) : (chars.length / 2);
        for (int i = 0; i < toChar; i++) {
            if (chars[i] != chars[(chars.length - (1 + i))]) {
                System.out.println("Слово не є паліндромом");
                return false;
            }
        }
        System.out.println("Слово є паліндромом");
        return true;
    }
}
