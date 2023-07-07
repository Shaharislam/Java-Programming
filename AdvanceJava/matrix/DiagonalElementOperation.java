package matrix;

import java.util.Scanner;

public class DiagonalElementOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row;
        int col;
        int sumOfDiagonalValue=0;
        int sumOfUpperDiagonalValue =0;
        int sumOfLowerDiagonalValue = 0;
        System.out.print("Input your Row and Column Number Row x Col:= ");
        row = input.nextInt();
        col = input.nextInt();
        int [][]Matrix1 = new int[row][col];
        System.out.println();
        System.out.println("Plz Input Matrix1 Data = Row X Column:= "+row + " X  "+col);
        for (int i=0;i<row;i++)
            for (int j=0;j<col;j++)
            {
                Matrix1[i][j]=input.nextInt();
            }

        System.out.println(" Your Matrix1 Data Is= Row X Column:= "+row + " X  "+col);
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("\t" + Matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        for (int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if(i == j){
                    sumOfDiagonalValue = sumOfDiagonalValue+ Matrix1[i][j];
                }
                if (i<j)
                {
                    sumOfUpperDiagonalValue = sumOfUpperDiagonalValue+ Matrix1[i][j];
                }
                if (i>j){
                    sumOfLowerDiagonalValue = sumOfLowerDiagonalValue + Matrix1[i][j];
                }
            }

        }
        System.out.println();
        System.out.println("Sum Of Diagonal Value of this Matrix:= "+sumOfDiagonalValue);
        System.out.println("Sum Of Upper Diagonal Value of this Matrix:= "+sumOfUpperDiagonalValue);
        System.out.println("Sum Of Lower Diagonal Value of this Matrix:= "+sumOfLowerDiagonalValue);
    }
}
