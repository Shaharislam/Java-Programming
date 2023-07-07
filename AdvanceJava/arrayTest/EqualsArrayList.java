package arrayTest;

import java.util.ArrayList;
import java.util.Arrays;

public class EqualsArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number1 = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        //Adding  value in Number1 ArrayList
        number1.add(20);
        number1.add(30);
        number1.add(10);
        number1.add(2, 50);
        number1.addAll(Arrays.asList(60, 70, 80));
        System.out.println();
        System.out.print("Number1 ArrayList Value:= ");
        System.out.print(" " + number1);
        System.out.println();
        number2.addAll(number1);
        System.out.print("Number2 ArrayList Value:= ");
        System.out.print(" " + number2);
        number3.addAll(number1);
        number3.addAll(number2);
        System.out.println();
        System.out.print("Number3 ArrayList Value:= ");
        System.out.print(" " + number3);
        System.out.println();
        boolean ans = number1.equals(number2);
        System.out.println("Number1 == Number2:= is "+ ans);




    }
}
