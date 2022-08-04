package second;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = scanner.nextLine();

        char [] golosni = {'А', 'Е', 'Є', 'И', 'І', 'Ї', 'О', 'У', 'Ю', 'Я',};

        System.out.println(takingOffLetters(s, golosni));
    }

    public static String takingOffLetters(String mainString, char[] letters) {
        char [] chars = mainString.toCharArray();
        for (int i = 0; i < chars.length; i++)
            for (int j = 0; j < letters.length; j++)
                if (Character.toUpperCase(chars[i]) == letters[j])
                    chars[i] = '-';
        return new String(chars);
    }
}
