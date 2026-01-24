package practice1;

import java.util.Scanner;

public class problem6 {
    public static boolean isPalindrome(String s) {
        char[] arr = s.toCharArray(); // Splits a string into char elements

        int i = 0;
        int j = s.length() - 1;

        // We go through the letters of the string from the beginning and from the end.
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the text to check for palindrome: ");
        String text = in.next();

        boolean test = isPalindrome(text);

        if (test) {
            System.out.println("The " + text + " is palindrome!");
        }
        else {
            System.out.println("The " + text + " is not palindrome!");
        }

    }
}

