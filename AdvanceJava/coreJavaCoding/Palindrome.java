package coreJavaCoding;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String original, reverseNumber = "";
        System.out.println("Input your Number: ");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverseNumber = reverseNumber + original.charAt(i);
        if (original.equals(reverseNumber))
            System.out.println(original+ " is a palindrome Number");
        else
            System.out.println(original+ " is not a palindrome Number");
    }
}

