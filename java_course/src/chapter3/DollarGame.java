package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main (String args[]) {
        double dollar = 1;
        double pennie = 0.01;
        double nickle = 0.05;
        double dime = 0.1;
        double quarter = 0.25;

        System.out.println("How many pennies do you enter?");
        Scanner scanner = new Scanner(System.in);
        double numberPennies = scanner.nextDouble();
        double allPennies = numberPennies * pennie;

        System.out.println("How many nickles do you enter?");
        double numberNickles = scanner.nextDouble();
        double allNickles = numberNickles * nickle;

        System.out.println("How many dimes do you enter?");
        double numberDimes = scanner.nextDouble();
        double allDimes = numberDimes * dime;

        System.out.println("How many quarters do you enter?");
        double numberQuarters = scanner.nextDouble();
        double allQuarters = numberQuarters * quarter;

        if ((allPennies + allDimes + allNickles + allQuarters) == dollar) {
            System.out.println("You've won!");
        } else {
            System.out.println("You lost!");
        }

    }
}
