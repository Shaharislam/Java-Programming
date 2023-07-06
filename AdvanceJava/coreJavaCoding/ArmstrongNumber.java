package coreJavaCoding;
import java.util.Scanner;
import java.math.*;
public class ArmstrongNumber {

    static boolean checkArmstrong(int number)
    {
        int temp, digits=0, last=0, sum=0;
        temp=number;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = number;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(number==sum){
            System.out.println();
            System.out.print("Armstrong Number:= "+number+": ");
            temp = number;
            while(temp>0)
            {
                last = temp % 10;
                temp = temp/10;
                System.out.print(" "+last+"^"+digits+" + ");
            }

            return true;
        }

        else
            return false;
    }
    public static void main(String[] args) {

            int num;
            Scanner sc= new Scanner(System.in);
            System.out.print("Input Your limit: ");
            num=sc.nextInt();
            System.out.println("Armstrong Number up to "+ num + " are: ");
            for(int i=0; i<=num; i++)
                if(checkArmstrong(i))
                    System.out.print(" := "+i+ ", ");
        }
    }



