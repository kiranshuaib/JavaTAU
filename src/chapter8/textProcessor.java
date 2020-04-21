package chapter8;

/**
 * counts the number of words in a string and prints them individually in a new line
 */
public class textProcessor {
    public static void main(String[] args) {
//        countWords("I love test automation University");
//        reverseString("Hello TAU");
        addSpaces("HeyWorld!It'sMeKiran");
    }

    /**
     * Splits a string into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");//take a text and split whereever there is a space
        int numOfWords = words.length;
        String message = String.format("you text contains %d words:",numOfWords);
        System.out.println(message);

        for(int i=0;i<numOfWords;i++) System.out.println(words[i]);


    }

    /**
     * print a string in reverse order
     * @param text string to reverse
     */
    public static void reverseString(String text){
        for(int i = text.length()-1;i>=0;i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);// allow us to modify the string
        for(int i=0; i<modifiedText.length();i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                        i++;
            }
        }
        System.out.println(modifiedText);
    }
}
