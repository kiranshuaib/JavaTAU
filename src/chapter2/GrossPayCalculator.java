package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // 1. Get the number of hours
            System.out.println("Enter the number of hours the employee work!");
            Scanner scanner = new Scanner(System.in);
            int hours = scanner.nextInt();

        // 2. Get the hourly pay
            System.out.println("Enter the employee pay rate");
            double rate = scanner.nextDouble();
            scanner.close();

        // 3.Multiply hours and pay here
            double grossPay = hours * rate;

        // 4. Disply result
            System.out.println("The Employee Grosspay is = $" +grossPay);
    }
}
