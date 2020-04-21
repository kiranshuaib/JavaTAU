package chapter3;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args){
        //initialize the known variables
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we dont
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years you are with your current employer");
        double years = scanner.nextDouble();
        scanner.close();

        //Make decision
        if (salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats you are qualified for the loan");
            } else{
                System.out.println("Sorry you must worked at your current job "
                + requiredYearsEmployed+" years.");
            }
        }
        else {
           System.out.println("Sorry, you must earned atleast $ "+ requiredSalary+ " to qualify for the loan");
        }

    }
}
