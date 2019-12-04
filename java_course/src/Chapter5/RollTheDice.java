package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class RollTheDice {
    public static void main (String args[]) {
        // The objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
        int maxRolls = 5;
        int board = 20;
        int total = 0;
        int place;

        // 1. generating random throw
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < maxRolls; i++) {
            int dieCast = random.nextInt(6) + 1;
            total = total + dieCast;
            place = board - total;

            if (total == board) {
                System.out.println("You've rolled a " + dieCast
                        + ". You're on space 20. Congrats, you've WON!");
                break;
            } else if (i == (maxRolls-1) && total < board) {
                System.out.println("You've rolled a " + dieCast + ". You are now on space "
                        + total + ". You LOST the game by " + place + " points");
            } else if (total < board) {
                System.out.println("You've rolled a " + dieCast + ". You are now on space "
                        + total + " and have " + place + " more to go");
            } else {
                System.out.println("You LOST the game. You rolled to much!");
            }
        }
    }
}
