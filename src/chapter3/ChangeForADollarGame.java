package chapter3;

import java.util.Scanner;

/* CHANGE FOR A DOLLAR GAME
 enter enough change equals $1
 ASk user quantities of coin
 pennies
 nickel
 dimes
 quarter

 IF $1 they win,
 if more than $1 how much they went over
 if more than $1 tell them how much they went under
 */
public class ChangeForADollarGame {
    public static void main(String[] args) {

        double penny = 0.01;
        double dime = 0.1;
        double nickel = 0.2;
        double quarter = 0.25;

        // Ask the user for the change they have
        System.out.println("How many pennies do you have");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();

        System.out.println("How many nickels do you have");
        double nickels = scanner.nextDouble();

        System.out.println("How many dimes do you have");
        double dimes = scanner.nextDouble();

        System.out.println("How many quarters do you have");
        double quarters = scanner.nextDouble();
        scanner.close();

        //Calculate the change
        double change;
        change = (pennies* penny)+(dimes * dime)+(nickels * nickel)+(quarters * quarter);
        System.out.println("You have "+change+" as change");

        double less = 1 - change;
        double extra = change - 1;
        if(change > 1.0)
            System.out.println("You are "+extra+ " more than a dollar ");
        else if(change < 1.0)
                   System.out.println("You are "+less+ " less than a dollar");
        else
            System.out.println("Congragulations, you won! you change is exactly $1");


    }

    }

