package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main (String arg[]) {
        // 1. Add values we know
        int quota = 10;

        // 2. Get unknown values
        System.out.println("Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // 3. Make a decision path
        if (sales >= quota) {
            System.out.println("Congrats, you've met you've quota");
        } else {
            int finalQuota = quota - sales;
            System.out.println("Sorry, you failed! You lack " + finalQuota + " sales");
        }
    }
}
