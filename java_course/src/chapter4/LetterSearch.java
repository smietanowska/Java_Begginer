package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main (String args[]) {
        System.out.println("Enter the fraze");
        Scanner scanner = new Scanner(System.in);
        String fraze = scanner.next();
        scanner.close();
        boolean letterFound = false;

        for (int i = 0; i < fraze.length(); i++ ) {
            char currentLetter = fraze.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a' ) {
                letterFound = true;
                break;
            }
        }
        if (letterFound) {
            System.out.println("Victory");
        } else {
            System.out.println("Nope...");
        }
    }
}
