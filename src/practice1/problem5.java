package practice1;

import java.util.Scanner;
public class problem5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your balance: ");
        double balance = in.nextDouble();

        System.out.print("Enter interest in percents: ");
        double interest_rate = in.nextDouble();

        double interest = (balance * interest_rate) / 100;
        double new_balance = balance + interest;

        if (balance >= 0 && interest_rate >= 0) {
            System.out.println("Your balance after the " + interest_rate + " % interest is " + new_balance);
        }
        else {
            System.out.println("The balance or interest rate is negative!");
        }
    }
}
