package coreJavaCoding;

public class FibonacciSeries {
    public static void main(String args[]) {
        int first = 0, second = 1, nextNumber, i, count = 10;
        System.out.print(first + " " + second); //print 0 and 1

        for (i = 2; i < count; ++i) //This loop starts from 2 , 0 and 1 are already printed
        {
            nextNumber = first + second;
            System.out.print(" " + nextNumber);
            first = second;
            second = nextNumber;
        }

    }

    // Using Function
    static int firstNumber =0, SecondNumber =1, nextNumber=0;
    static void printFibonacci(int count){
        if(count>0){
            nextNumber = firstNumber + SecondNumber;
            firstNumber= SecondNumber;
            SecondNumber = nextNumber;
            System.out.print(" "+nextNumber);
            printFibonacci(count-1);
        }
    }


}
