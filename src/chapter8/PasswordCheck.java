package chapter8;

import java.util.Scanner;

/**
 * The password must be
 * at least eight characters long,
 * contain an uppercase letter,
 * contain a special character,
 * not contain the username and
 * not be the same as the old password.
 */

public class PasswordCheck {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter username");
        String username = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        String currentPassword = getProposedPassword();
        checkPassword(username,password,currentPassword);

    }
    public static String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }



    public static void checkPassword(String username, String password,String currentPassword){
        System.out.println(password.length());

        var modifiedText = new StringBuilder(password);
        if((modifiedText.length()>=8 )&& !(modifiedText.equals(username)) && !(modifiedText.equals(currentPassword))) {

            for (int i = 0; i < modifiedText.length(); i++) {
                if(Character.isUpperCase(modifiedText.charAt(i)) || !(Character.isLetter(modifiedText.charAt(i)) )){
//                    System.out.println((modifiedText.charAt(i)));

                }

            }
            System.out.println("Your new password must meet the following requirements:");
            System.out.println("* at least 8 characters long");
            System.out.println("* contain an uppercase letter");
            System.out.println("* contain a special character");
            System.out.println("* not contain the username");
            System.out.println("* not equals the old password");
        }
    }

}
