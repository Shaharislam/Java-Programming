package coreJavaCoding;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input your first number : ");
        int firstNumber = s.nextInt();
        System.out.print("Input Your last number : ");
        int last = s.nextInt();
        int countPrime=0;
        System.out.println("List of prime numbers " + firstNumber + " To " + last);
        for (int i = firstNumber; i <= last; i++) {
            if (checkPrime(i)) {
                System.out.print(i+" , ");
                 countPrime++;
            }

        }
        System.out.println();
        System.out.println("Total Prime Number := "+countPrime);
    }
    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
