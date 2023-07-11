package arrayAndList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("ArrayList Size Without Data:= " + number.size());
        //Adding  value in ArrayList
        number.add(20);
        number.add(30);
        number.add(10);
        number.add(2, 50);

        //Array List Print Option-01
        System.out.print(" " + number);
        System.out.println();

        Collections.sort(number);
        System.out.print(" After sorting Ascending:=  " + number);

        System.out.println();
        Collections.sort(number,Collections.reverseOrder());
        System.out.print("After sorting and Reverse:=  " + number);

    }
}
