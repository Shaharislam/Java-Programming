package coreJavaCoding;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int fact=1;
        System.out.println("Plz Input your Number:= ");
        int numberInput=in.nextInt();
        fact = factorial(numberInput);
        System.out.println("Factorial of "+numberInput+" is: "+fact);
    }

    static int factorial(int number){
        if (number == 0)
            return 1;
        else
            return(number * factorial(number-1));
    }
}
