package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main (String args[]) {
        // 1. Calculating numbers until user is satisfied
        boolean repeat;
        Scanner  scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the first number.");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number.");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("Do you want to run again?");
            repeat = scanner.nextBoolean();

        } while (repeat);

        scanner.close();

    }
}
