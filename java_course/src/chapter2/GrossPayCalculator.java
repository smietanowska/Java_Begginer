package chapter2;

import java.util.Scanner;

public class GrossPayCalculator  {

    public static void main (String arg[]) {
        //java comment
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2.Get the hourly pay rate
        System.out.println("Enter the hourly pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours by pay rate
        double grossPay = hours * rate;
        System.out.println("The gross pay is " + grossPay);

    }

}
