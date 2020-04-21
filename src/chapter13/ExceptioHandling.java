package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptioHandling {
    public static void main(String[] args) throws IOException {
        //createNewFile();
        numberExceptionHandling();
        createNewFileReThrow();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistant.txt");
        try {
            file.createNewFile();
        } catch (Exception e){
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileReThrow() throws IOException{
        File file = new File("resources/nonexistant.txt");
        file.createNewFile();

    }
    public static void numberExceptionHandling(){
        File file = new File("resources/nonexistant.txt");

        try(Scanner fileReader = new Scanner(file);){ //try with resources to close the
            while (fileReader.hasNext()){
                double num = fileReader.nextDouble(); //to read each line from the file
                System.out.println(num);
//                if each line from the file is not from the double then we will get typeMismatch  exception
            }
        }
        catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();// to read each line from the exception
        }

    }
}
