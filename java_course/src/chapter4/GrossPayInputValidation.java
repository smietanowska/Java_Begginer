package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String args[]) {
        // 1. Initialize known variables
        int pay = 15;
        int hours = 40;

        // 2. Get other factor
        System.out.println("How many hours did you worked?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // 3.Validate
        while (hoursWorked > hours || hoursWorked < 1) {
            System.out.println("Invalid entry, try again!");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // 4. Calculate
        double gross = pay * hoursWorked;
        System.out.println("Gross pay is " + gross);
    }
}
