package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main(String args[]) {
        // 1. Get number of items to scan
        System.out.println("Enter the number of items you want to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

        for(int i = 0; i < quantity; i++) {
            System.out.println("How much does it cost?");
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Total price is: " + total);
    }
}
