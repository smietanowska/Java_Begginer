package chapter3;

import java.util.Scanner;

/*
multiline notation
 */
public class SalaryCalculator {
    public static void main (String arg[]) {
        // 1. Figure out what i already know
        int salary = 1000;
        int bonus = 250;
        int value = 10;

        // 2. Get what I don't know
        System.out.println("How many sales did you did this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // 3. Check for bonus earners
        if (sales > value) {
            salary = salary + bonus;
        }
        // 4. Output
        System.out.println("Employees pay is $ " + salary);
    }
}
