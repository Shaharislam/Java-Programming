package numberProgram;

import java.util.*;

public class AutoMorphicNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input your Number:= ");
        int number = sc.nextInt();

        System.out.println(isNumberAutomorphic(number) ? "Automorphic" : "Not Automorphic");

    }

    static boolean isNumberAutomorphic(int num) {
       int squareValue = num*num;

       while (num>0)
       {
           if(num%10 != squareValue%10)
               return false;
           num = num/10;
           squareValue = squareValue / 10;
       }
        return true;
    }

}
