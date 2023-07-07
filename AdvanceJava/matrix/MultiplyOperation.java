package matrix;

import java.util.Scanner;

public class MultiplyOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        System.out.print("Input your Row and Column Number Row x Col:= ");
        row = input.nextInt();
        col = input.nextInt();
        int [][]Matrix1 = new int[row][col];
        int [][]Matrix2 = new int[row][col];
        int [][]mulMatrix = new int[row][col];
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
        System.out.println("Multiply two Matrix Matrix1 X Matrix2:= ");

        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    mulMatrix[i][j] = Matrix1[i][k] * Matrix2[k][j];

                }
            }

        }
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {

                System.out.print("\t"+mulMatrix[i][j]);
            }
            System.out.println();
        }

    }
}
