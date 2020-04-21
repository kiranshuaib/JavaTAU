package chapter2;

import java.util.Scanner;

public class MedLibs2 {
    public static void main(String arg[]){
        //Ask the season of the year
        System.out.println("What is the current season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Ask the number
        System.out.println("Enter a whole number");
        int num = scanner.nextInt();

        // Ask an adjective
        System.out.println("Enter an adjective");
        String adj = scanner.next();

        //Display result
        System.out.println("On a "+adj+ " " +season+" "+" day, I drink a minimum of "+ num +" cups of coffee.");



    }
}
