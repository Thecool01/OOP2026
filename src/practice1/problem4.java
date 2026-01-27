package practice1;

import java.util.Locale;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        double a, b, c, D;

        System.out.print("Enter a: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input for a");
            return;
        }
        a = in.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            return;
        }

        System.out.print("Enter b: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input for b");
            return;
        }
        b = in.nextDouble();

        System.out.print("Enter c: ");
        if (!in.hasNextDouble()) {
            System.out.println("Invalid input for c");
            return;
        }
        c = in.nextDouble();

        D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Discriminant is negative, no roots.");
        }
        else if (Math.abs(D) < 1e-9) {
            double x = -b / (2 * a);
            System.out.println("There is one root: x = " + x);
        }
        else {
            double sqrtD = Math.sqrt(D);

            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);

            System.out.println("There are two roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        in.close();
    }
}
