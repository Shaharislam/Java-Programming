package stringPackage;

import java.util.Locale;

public class StringOperation {

    public static void main(String[] args){
        countWords("I love Test Automation University");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;



        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
        System.out.println();
        var lowerCaseSentence = text.toLowerCase();
        System.out.println("LowerCase Sentence "+lowerCaseSentence);
        var upperCaseSentence = text.toUpperCase();
        System.out.println("UpperCase Sentence "+upperCaseSentence);

    }
}
