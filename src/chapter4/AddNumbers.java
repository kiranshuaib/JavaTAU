package chapter4;

import java.util.Scanner;

/*
   *Do while loop
   * write a program that allows the user to add two number,
   * then sum ups the two numbers. the user should be able to repeat this action
   * until they indicate they are done
 */
public class AddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("sum of two number is" + sum);
            System.out.println("Would you like to start over? Answer in true or false");
            again = scanner.nextBoolean();//sentinel

        } while (again);
        scanner.close();
    }
}
