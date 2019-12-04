package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main (String args[]) {
        // 1. Initialize variables
        int students = 24;
        int tests = 4;
        Scanner scanner = new Scanner(System.in);

        // 2. Find average test score
        for (int i = 0; i < students; i++) {
            double total = 0;
            for (int j = 0; j < tests; j++) {
                System.out.println("Enter the score for test #" + (j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total/tests;
            System.out.println("Total average for student nr # " + (i+1) +" is " + average);
        }
        scanner.close();
    }
}
