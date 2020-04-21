package chapter3;
/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don’t, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]){
        //Initialize value we know
        int quota =10;

        // get the values we dont
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on the path we take
            if(sales >= quota){
                System.out.println("congrats! you have met your data");
            }
            else {
                int sales_short = quota - sales;
                System.out.println("YOU did not make your quota, you were " + sales_short + " sales short.");
            }
    }
}
