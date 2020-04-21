package chapter4;

import java.util.Random;

public class RollADieGame {
    public static void main(String[] args) {
        // Initialize the known variables
        int lastSpace =20;
        int maxRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        for(int i=0;i<maxRolls;i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            //System.out.println("Roll #:" + i + " You have rolled a " +die);
           // System.out.println(currentSpace);

            if(currentSpace == lastSpace){
                System.out.println("End the game - you’ve won.");
                break;
            } else if (currentSpace > lastSpace){
                System.out.println("Unfortunately, that makes you pass " +lastSpace+ " that makes you looose");
                break;
            }else if (i == maxRolls && currentSpace < lastSpace){
                System.out.println("You have rolled a "+die+". You are on space "+currentSpace+ ". Unfortunately you didn't make it to all" +
                        lastSpace + "spaces. you loose");
            }else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.println("You have rolled a " +die+ " .You have more "+ spacesToGo + " spaces to go, you are now on "+currentSpace +".");
            }
        }

    }
}
