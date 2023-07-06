package coreJavaCoding;

public class Pattern {
    public static void main(String args[])
    {
        int i, j, row=6;
        for(i=0; i<row; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        int a=0, b=0, r = 6;
        for(a=0; a<r; a++)
        {
            for (b=2*(r-a); b>=0; b--)
            {
                System.out.print(" ");
            }
            for (b=0; b<=a; b++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }

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
    }

}
