package matrix;

import java.util.Scanner;

public class SubtractionMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Input your Row and Column Number Row x Col:= ");
        row = input.nextInt();
        col = input.nextInt();
        int [][]Matrix1 = new int[row][col];
        int [][]Matrix2 = new int[row][col];
        int [][]subMatrix = new int[row][col];
        System.out.println();
        System.out.println("Plz Input Matrix1 Data = Row X Column:= "+row + " X  "+col);
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
            {
                Matrix1[i][j]=input.nextInt();
            }

        System.out.println();
        System.out.println("Plz Input Matrix2 Data = Row X Column:= "+row + " X  "+col);
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
            {
                Matrix2[i][j]=input.nextInt();
            }

        System.out.println();
        System.out.println("Matrix1:= ");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t"+Matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Matrix2:= ");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t"+Matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("Subtraction two matrix Matrix1 && Matrix2:= ");

        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {

                subMatrix[i][j] = Matrix1[i][j]-Matrix2[i][j];
                System.out.print("\t"+subMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
