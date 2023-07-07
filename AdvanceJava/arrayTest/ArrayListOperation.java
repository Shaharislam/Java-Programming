package arrayTest;

import java.util.*;

public class ArrayListOperation {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("ArrayList Size Without Data:= "+number.size());
        //Adding  value in ArrayList
        number.add(20);
        number.add(30);
        number.add(10);
        number.add(2,50);


        //Array List Print Option-01
        System.out.print(" "+number);
        System.out.println();
        System.out.println("ArrayList Size With Data:= "+number.size());

        // ArrayList Data print with For Each Loop
        System.out.println();
        System.out.print("ArrayList Data Print with For Each Loop:= ");
        for(int x: number)
            System.out.print(" "+x+",");

        //ArrayList Data Print with Iteration
        Iterator itr = number.iterator();
        System.out.println();
        System.out.print("ArrayList Data Print with Iteration Method := ");
        while (itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }

        //Remove Data
        System.out.println();
        System.out.print("After Remove ArrayList Data:= ");
        number.remove(2);
        System.out.print(number);

        //Remove All data from Array List
        System.out.println();
        System.out.print("Remove All ArrayList Data:= ");
        number.removeAll(number);
        System.out.print(number);


    }
}
