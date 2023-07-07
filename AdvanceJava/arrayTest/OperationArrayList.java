package arrayTest;

import java.util.ArrayList;
import java.util.Arrays;

public class OperationArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("ArrayList Size Without Data:= " + number.size());
        //Adding  value in ArrayList
        number.add(20);
        number.add(30);
        number.add(10);
        number.add(2, 50);

        System.out.print(" "+number);

        number.addAll(Arrays.asList(60,70,80));
        //Adding some data
        System.out.println();
        System.out.println("Adding Some 60,70,80 value:= ");
        System.out.print(" "+number);
        System.out.println();

        boolean ans= number.isEmpty(); //empty method
        System.out.println("isEmpty:= "+ans);

        boolean con = number.contains(50); // Contains Method
        System.out.println();
        System.out.println("is ArrayList Contains:= "+50+" ? Ans:= "+con);

        int indx= number.indexOf(50); // Index of method
        System.out.println();
        System.out.println("Index Of 50 is:= "+indx);

        number.set(2,100); // replace data
        System.out.println();
        System.out.print("After replace 50 by 100 index of 2 := "+number);
        System.out.println();
        System.out.println("Get 2 Index Data:= "+number.get(2));
        System.out.println();
        System.out.println("Get 2 Equals Data:= "+number.equals(100));
    }

}
