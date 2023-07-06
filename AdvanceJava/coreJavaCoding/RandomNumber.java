package coreJavaCoding;
import java.util.Random;
public class RandomNumber {
    public static void main(String args[])
    {
        Random random = new Random();
        System.out.println("General Random Number: " + Math.random());
        int number = random.nextInt(100);
        System.out.println("Random Number:= "+number);
    }
}
