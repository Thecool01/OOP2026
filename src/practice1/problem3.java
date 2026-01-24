package practice1;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the score (from 0 to 100): ");
        int score = in.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("You entered wrong number!");
        } else if (score > 94) {
            System.out.println("Your grade is 'A'");
        } else if (score > 89) {
            System.out.println("Your grade is 'A-'");
        } else if (score > 84) {
            System.out.println("Your grade is 'B+'");
        } else if (score > 79) {
            System.out.println("Your grade is 'B'");
        } else if (score > 74) {
            System.out.println("Your grade is 'B-'");
        } else if (score > 69) {
            System.out.println("Your grade is 'C+'");
        } else if (score > 64) {
            System.out.println("Your grade is 'C'");
        } else if (score > 59) {
            System.out.println("Your grade is 'C-'");
        } else if (score > 54) {
            System.out.println("Your grade is 'D+'");
        } else if (score > 49) {
            System.out.println("Your grade is 'D'");
        } else {
            System.out.println("Your grade is 'F'");
        }
    }
}
