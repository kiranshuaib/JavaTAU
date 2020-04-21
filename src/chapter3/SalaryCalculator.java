package chapter3;
/*
    If Statements
    All sales people got salary of $100 a week.
    Sales person who exceeds 10 sales per week will get additional $250.
     */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String args[]){
        //initialize the known values
            int salary = 1000;
            int bonus = 250;
            int quota = 10;

        //Get the values that are unknown
        System.out.println("How many sales the employee made this week?");
            Scanner scanner = new Scanner(System.in);
            int sales = scanner.nextInt();
            scanner.close();

        //Quick detour for the bonus earners
            if(sales > quota){
                salary = salary + 250;
            }

        //output
            System.out.println("The Employee's salary this month is $" + salary);
    }
}
