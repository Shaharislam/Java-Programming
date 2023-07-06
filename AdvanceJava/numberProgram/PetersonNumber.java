package numberProgram;

import java.util.*;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your Number:= ");
        int number = sc.nextInt();
        if (isNumberPeterson(number))
            System.out.println("Your Number "+number +" is Peterson");
        else
            System.out.println("Your Number "+number +" is not Peterson");

    }

    static boolean isNumberPeterson(int num){
          int number = num;
          int sum = sumOfFactorial(number);

        return (sum == num);

    }

    public static int sumOfFactorial(int n){
        int factSum=0;
        int temp=0;

        while (n !=0){
            temp = n%10;
            factSum =factSum+ factorial(temp);
            n=n/10;
        }

        return factSum;
    }
    static int factorial(int number){
        if (number == 0)
            return 1;
        else
            return(number * factorial(number-1));
    }
}
