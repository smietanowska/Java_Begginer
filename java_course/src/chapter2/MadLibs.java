package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main (String arg[]) {
        // 1. Ask for a season
        System.out.println("What is the season ?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Ask for description
        System.out.println("How it is?");
        String adjective = scanner.next();

        // 3. Ask for number of cups
        System.out.println("How many cups do you drink?");
        int cups = scanner.nextInt();
        scanner.close();

        // 4. Print the sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + cups + " cups of coffee");
    }
}
