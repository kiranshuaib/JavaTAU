package chapter4;
/*
 *FOR LOOP:
 *Write a cashier program that will scan a given number of items and telly the cost
 */

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {

        //Get the numbers of item to scan
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();


        double total = 0;

        //Create a loop that iterate thrugh all of the items and accumulate costs
        for(int i = 0; i<quantity; i++){
            System.out.println("Enter the cost of the item");
            double price =  scanner.nextDouble();
            total = total + price;//accumulator
        }
        scanner.close();
        System.out.println("Your totla is "+ total);

    }
}
