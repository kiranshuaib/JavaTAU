package chapter7;

import java.util.Arrays;
import java.util.Random;
/*
 We're going to create a Lottery Quick Pick application that will generate a lottery ticket with 6 random numbers, between 1 and 69.
 I'm going to show you how to write this program,
 */

public class LotteryTicket{
    private static int LENGTH = 6;
    private static final int  MAX_NUM = 69;

    public static void main(String[] args) {
        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printTickets(tickets);
    }
    public static int[] generateNumbers(){
       int[] tickets = new int[LENGTH];
       Random random = new Random();
       for(int i=0;i<LENGTH;i++){
           //generate a random number and search to make sure it is not already present in the array
           //if it does regenerate and search again.
            int randomNumber;
           do{
               randomNumber = random.nextInt(MAX_NUM)+1;
           } while (search(tickets,randomNumber));
           tickets[i] = randomNumber;
       }
       return tickets;
    }

    /**
     * Does a sequential search on the array to find  a value
     * @param array Array to search for
     * @param numberToSearchFor value to search for
     * @return true if found and false if not.
     */
    public static boolean search(int[] array, int numberToSearchFor){
        //This is called an enhanced loop. It iterates through array for each time assigned the current element value
        for(int value: array) {
            if (value == numberToSearchFor) {
                return true;
            }
        }
        //if we reach this point then the entire array was searched and the value was not found
        return false;
        }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array,numberToSearchFor);
        if(index >=0) {
            return true;
        } else return false;


    }
    public static void printTickets(int[] tickets){
        for(int i=0;i<LENGTH;i++){
            System.out.print(tickets[i] +" | ");
        }
    }


}
