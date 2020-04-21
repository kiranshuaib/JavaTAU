package chapter4;

import java.util.Scanner;

/*
 * NESTED LOOPS
 * Find the average of each student test score.
 * There are 24 students and 4 tests
 */
public class AverageTestScores {
    public static void main(String[] args) {
    //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;
        Scanner scanner = new Scanner(System.in);
    // Process all students
        for(int i=0;i<numberOfStudents;i++){
            double total =0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the score for test #" +(j+1));//bcose j is zero right now
                double score = scanner.nextDouble();
                total = total+score;
            }
            double average = total/numberOfTests;
            System.out.println("The test average for student #"+(i+1) +" is " + average);
        }
    }
}
