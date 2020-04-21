package chapter5;
/*
 *So, what you're going to do is allow the user to input the plan fee and the number of overage minutes.
 * And then you're going to charge 25 cents for every minute that they've gone over,
 * and then a 15% tax on the subtotal.
 *I want you to create separate methods to calculate the tax, to calculate the overage fees, and to calculate and print the final total.

Please print this as an itemized bill.
 */

import java.lang.reflect.Method;
import java.util.Scanner;

public class PhoneBillCalculator {
    static double overage = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialize that is known


        //Take input on what is unknown
        double basePlanFee = getBasePlanFee();
        double overageMinutes = getOverageMinutes();
        scanner.close();

        /* Calculate the overage fee, tax and final total */
        double overageFee = calculateOverageFee(overageMinutes);
        double tax = tax(basePlanFee, overageFee);
        total(basePlanFee, overageFee, tax);

    }

    public static double getBasePlanFee() {
        System.out.println("Enter base cost of the plan");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }

    //Method to take number of overage minutes from the user
    public static double getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    //Method to calculate overageFee
    public static double calculateOverageFee(double overageMinutes) {
        double overageMin = overageMinutes * overage;
        return overageMin;
    }

    //Method to calculate tax
    public static double tax(double basePlanfee, double overageFee) {
        double taxTotal = (basePlanfee + overageFee) * tax;
        return taxTotal;
    }

    //Method to calculate total
    public static double total(double basePlanFee, double overageFee, double tax) {
        double finalTotal = basePlanFee + overageFee + tax;


        System.out.println("Phone Bill Statement");
        System.out.println("Plan:$ " + String.format("%.2f", basePlanFee));
        System.out.println("Overage:$ " + String.format("%.2f", overageFee));
        System.out.println("Tax:$ " + String.format("%.2f", tax));
        System.out.println("Total:$ " + String.format("%.2f", finalTotal));
        return finalTotal;
    }

}
