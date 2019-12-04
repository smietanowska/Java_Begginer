package chapter6;

import java.util.Scanner;

public class PhoneBillCalculator {
    static double fee = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {
        double oMin = overageMinutes();
        double pFee = planFee();
        scanner.close();
        double overPay = calculateFee(oMin, fee);
        double overTax = calculateTax(overPay, tax);

        printTheBill(pFee, overPay, overTax);

    }

    public static double overageMinutes() {
        System.out.println("Enter number of overage minutes:");
        double minutes = scanner.nextDouble();
        return minutes;
    }

    public static double planFee() {
        System.out.println("Enter the fee of User's Plan:");
        double plan = scanner.nextDouble();
        return plan;
    }

    public static double calculateFee(double oMin, double fee) {
        double overpay = oMin * fee;
        return overpay;
    }

    public static double calculateTax(double overPay, double tax) {
        double overTax = overPay * tax;
        return  overTax;
    }

    public static void printTheBill (double pFee, double overPay, double overTax ) {
        double total = pFee + overPay + overTax;

        System.out.println("Your Phone Bill:");
        System.out.println("Cost of plan: " + pFee + " $");
        System.out.println("Cost of overage minutes: " + overPay + " $");
        System.out.println("Cost of additional tax: " + overTax + " $");
        System.out.println("Total: " + total + " $");
    }

}
