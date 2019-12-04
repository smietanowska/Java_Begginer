package chapter3;

import java.util.Scanner;

public class LoanQualifierOperators {

    public static void main (String arg[]) {
        // 1. What we know
        int reqSalary = 30000;
        int reqYears = 2;

        // 2. What we don't know
        System.out.println("Enter salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter years");
        double years = scanner.nextDouble();
        scanner.close();

        // 3. Make a decision
        if (salary >= reqSalary && years >= reqYears) {
                System.out.println("Congrats! You qualify!");
        } else {
            System.out.println("Sorry! You must earn more!");
        }
    }

}
