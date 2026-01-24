package practice1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class problem2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        int a;
        a = in.nextInt();

        int area, perimeter;
        double length_diagonal;

        area = a * a;
        perimeter = 4 * a;
        length_diagonal = a * sqrt(2);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Length_diagonal: " + length_diagonal);
    }
}
