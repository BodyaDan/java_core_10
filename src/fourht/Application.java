package fourht;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = scanner.nextLine();

        System.out.println("'" + modeWord(s) + "' - найпопулярніше слово у реченні");
    }

    public static String modeWord(String mainString) {
        int count = 0, tempCount = 0;
        String searchedWord = "";
        String [] arrayOfWords = mainString.toLowerCase().split(" ");
        for (int i = 0; i < arrayOfWords.length; i++) {
            tempCount = 0;
            for (int j = 0; j < arrayOfWords.length; j++)
                if (arrayOfWords[i].equals(arrayOfWords[j]))
                    tempCount++;
            if (tempCount > count) {
                count = tempCount;
                searchedWord = arrayOfWords[i];
            }
        }
        return searchedWord;
    }
}
