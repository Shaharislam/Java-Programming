package coreJavaCoding;
import java.util.*;
public class BlankPattern {
    public static void main(String[] args) {
        int k, l, w = 6;
        for (k=0; k<w; k++)
        {
            for (l=w-k; l>1; l--)
            {
                System.out.print(" ");
            }
            for (l=0; l<=k; l++ )
            {
                System.out.print("* ");

            }
            System.out.println();
        }
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int rows = sc.nextInt();
        for (i=1; i<= rows ; i++)
        {
            for (j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for (k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if( i==1)
            {
                System.out.println("");
            }
            else
            {
                System.out.println("*");
            }
        }
        for (i=rows-1; i>= 1 ; i--)
        {
            for ( j = rows; j > i ; j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            for ( k = 1; k < 2*(i -1) ;k++)
            {
                System.out.print(" ");
            }
            if(i==1)
                System.out.println("");
            else
                System.out.println("*");
        }
    }
}

