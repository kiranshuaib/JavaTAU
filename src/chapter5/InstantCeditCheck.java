package chapter5;
/*
 *VARIABLE SCOPE:
 * write an instant credit check program that approves
 * anyone who makes more than 25,000 and has a credit score
 * of 700 or better. Reject all others
*/

import java.util.Scanner;

public class InstantCeditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 750;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Initialize what we know


        //get what we dont know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if the user can qualify
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }
    public static double getSalary() {
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore,double salary){
        if(creditScore >= requiredCreditScore && salary >=requiredSalary){
            return true;
        } else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! you have been approved!");
        } else{
            System.out.println("Sorry! you have been declined!");

        }
    }
}
