package third;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = scanner.nextLine();

        System.out.println("К-сть слів у яких букв більше 2 - " + wordCount(s));
    }

    public static int wordCount(String str) {
        String [] arr = str.split(" ");
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i].length() > 2)
                count++;
        return count;
    }
}
