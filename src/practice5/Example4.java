package practice5;
import java.util.*;

public class Example4 {
   public static void main(String[] args) {

      // Test 1: Simple addition
      System.out.println("Test 1 - Simple addition: 3.0+5.0");
      System.out.println("Expected: 3.0+5.0 = 8.0");
      runExpression("3.0+5.0");
      System.out.println();

      // Test 2: Subtraction
      System.out.println("Test 2 - Subtraction: 9.0-3.0");
      runExpression("9.0-3.0");
      System.out.println();

      // Test 3: Multiplication
      System.out.println("Test 3 - Multiplication: 4.0*3.0");
      runExpression("4.0*3.0");
      System.out.println();

      // Test 4: Division
      System.out.println("Test 4 - Division: 15.0/3.0");
      runExpression("15.0/3.0");
      System.out.println();

      // Test 5: Multiple expressions
      System.out.println("Test 5 - Multiple expressions: 45.0+4.1   3.2*9.1");
      runExpression("45.0+4.1   3.2*9.1");
      System.out.println();

      // Test 6: Left operand is not a number
      System.out.println("Test 6 - Left operand not a number: abc+5.0");
      runExpression("abc+5.0");
      System.out.println();

      // Test 7: Right operand is not a number
      System.out.println("Test 7 - Right operand not a number: 5.0+xyz");
      runExpression("5.0+xyz");
      System.out.println();

      // Test 8: Division by zero
      System.out.println("Test 8 - Division by zero: 10.0/0");
      runExpression("10.0/0");
      System.out.println();

      // Test 9: Incomplete expression
      System.out.println("Test 9 - Incomplete expression: 45.0+");
      runExpression("45.0+");
      System.out.println();

      System.out.println("Test 10 - From example 45.0+4.1, 3.2*9.1");
      runExpression("45.0+4.1");
      runExpression("3.2*9.1");
      System.out.println();

   }

   static void runExpression(String input) {
      System.out.print("Actual:   ");
      StringTokenizer tokenizer = new StringTokenizer(input, "+-*/", true);
      double leftOperand, rightOperand, result;
      String leftString, operator, rightString;

      while (tokenizer.hasMoreTokens()) {
         try {
            leftString  = tokenizer.nextToken().trim();
            operator    = tokenizer.nextToken().trim();
            rightString = tokenizer.nextToken().trim();

            try {
               leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException e) {
               System.out.println("Left operand '" + leftString + "' is not a number");
               continue;
            }

            try {
               rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException e) {
               System.out.println("Right operand '" + rightString + "' is not a number");
               continue;
            }

            if (operator.equals("+"))
               result = leftOperand + rightOperand;
            else if (operator.equals("-"))
               result = leftOperand - rightOperand;
            else if (operator.equals("*"))
               result = leftOperand * rightOperand;
            else if (operator.equals("/")) {
               if (rightOperand == 0) {
                  System.out.println("Cannot divide by zero!");
                  continue;
               }
               result = leftOperand / rightOperand;
            } else {
               System.out.println("Unknown operator: " + operator);
               continue;
            }

            System.out.println(leftString + operator + rightString + " = " + result);

         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
         }
      }
   }
}