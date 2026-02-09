package lab1.Problem1;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        p1DataClass data = new p1DataClass();

        boolean run = true;

        while (run) {
            System.out.println("Enter number (Q to quit): ");
            String str = in.nextLine();

            if (str.equalsIgnoreCase("Q")) {
                System.out.println("Average = " + data.getAverage());
                System.out.println("Maximum = " + data.getMax());
                run = false;
            } else {
                try {
                    double value = Double.parseDouble(str);
                    data.addValue(value);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter the number or 'Q': ");
                }
            }
        }
    }
}
