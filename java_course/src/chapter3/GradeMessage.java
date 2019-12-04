package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main (String args[]) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Great!";
                break;
            case "C":
                message = "Good!";
                break;
            case "D":
                message = "You need to get better!";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "You've entered wrong value!";
                break;
        }

        System.out.println(message);

    }
}
