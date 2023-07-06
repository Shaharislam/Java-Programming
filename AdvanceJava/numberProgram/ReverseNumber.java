package numberProgram;
import javax.management.StringValueExp;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input your number:= ");
        int number = sc.nextInt();
        int numberFor= number;
        int reserved=0,reverse=0;

        while (number !=0) {
            reserved = number % 10;
            reverse = (reverse*10)+reserved;
            number = number / 10;
        }
        System.out.println("Reverse Number Using While Loop:= "+reverse);
        reverse=0;
        for (;numberFor !=0;numberFor=numberFor/10){
            reserved = numberFor % 10;
            reverse = (reverse*10)+reserved;
        }
        System.out.println("Reverse Number Using For Loop:= "+reverse);
        System.out.print("Again Reverse Number With Recursion Method:= ");
        goToReverseMethod(reverse);

    }

    public static void goToReverseMethod(int number){
       if (number<10){
           System.out.println(number);
       }
       else {
           System.out.print(number%10);
           goToReverseMethod(number/10);
       }
    }
}
