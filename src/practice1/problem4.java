package practice1;

import java.util.Scanner;

public class problem4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        double a, b, c, D;

        System.out.print("Enter a: ");
        a = in.nextDouble();

        System.out.print("Enter b: ");
        b = in.nextDouble();

        System.out.print("Enter c: ");
        c = in.nextDouble();

        D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Discriminant is negative, no roots.");
        }

        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("There is one x = " + x);
        }
        else {
            double sqrt_D = Math.sqrt(D);

            double x1 = (-b + sqrt_D) / (2 * a);
            double x2 = (-b - sqrt_D) / (2 * a);

            System.out.println("There are x1 = " + x1 + " and x2 = " + x2);
        }
    }
}
