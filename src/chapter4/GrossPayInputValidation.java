package chapter4;
/*
Each store employee makes $15 per hour. Write a program that allows the
employee to enter the number of hours worked for a week. Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

     //Initialize known variables
        int rate = 15;
        int maxHours = 40;

     //Get input for the unknown variable
     System.out.println(" how many hours have you worked this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

      //validate input
      while (hoursWorked > maxHours || hoursWorked <1) {
          System.out.println("Invalid entry, your hours must be between 1 and 40. Ty again.");
          hoursWorked = scanner.nextDouble();//sentinel
          /*sentinel: The sentinel value is a special input value
          that tests the condition within the while loop.*/
          scanner.close();
      }

       //Calculate the gross
       double gross = rate * hoursWorked;
       System.out.println("Gross pay: $" + gross);

    }
}
