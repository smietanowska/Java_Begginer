package chapter6;

import java.util.Scanner;

public class CreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        double s = getSalary();
        double c = getCreditScore();
        scanner.close();
        boolean q = isUserQualified(s, c);
        notifyUser(q);

    }

    public static double getSalary () {
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }

    public static double getCreditScore () {
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    public static boolean isUserQualified (double salary, double creditScore) {
        if (creditScore >= requiredCreditScore && salary >=requiredSalary) {
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser (boolean isQualified) {
        if(isQualified) {
            System.out.println("Congrats! You've been approved.");
        } else {
            System.out.println("Try next time!");
        }
    }

}
