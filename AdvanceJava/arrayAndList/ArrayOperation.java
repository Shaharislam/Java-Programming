package arrayAndList;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {

        int[] num = {10,30,-5,2,300,33};
        Arrays.sort(num);

        System.out.print("Ascending Array Value:= ");
        for (int i=0 ; i<num.length;i++)
        {
            System.out.print("  "+num[i]);
        }
        System.out.println();
        System.out.print("Descending Array Value:=");
        for (int j=num.length-1 ; j>=0;j--)
        {
            System.out.print("  "+num[j]);
        }

        String[] names= {"Rakibul","Bristy","Mukta","Rakib-Bristy","Rakib-Mukta"};
        Arrays.sort(names);
        System.out.println();
        System.out.print("Ascending Array Value:= ");
        for (int i=0 ; i<names.length;i++)
        {
            System.out.print("  "+names[i]);
        }
        System.out.println();
        System.out.print("Descending Array Value:=");
        for (int j=names.length-1 ; j>=0;j--)
        {
            System.out.print("  "+names[j]);
        }

    }


}
