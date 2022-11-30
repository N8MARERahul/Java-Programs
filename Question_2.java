/*WAP to accepts a 2D matrix and prints the matrix with row minimum and column minimum values...

4   3   5   -- 3
1   0   7   -- 0
8   4   6   -- 4
|   |   |
1   0   5
*/

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Create an object...

        //Taking the numbers of rows and columns of the matrix form user...
        System.out.println("Enter the rows and columns of the matrix:");
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int col = sc.nextInt();

        //Taking the elements of the matrix...
        int matrix[][] = new int[rows][col];
        System.out.println("Enter the elements of the Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < rows; i++) {   //Print the matrix row wise and print its row wise minimum value...
            int j = 0;
            int min = matrix[i][j];
            for(; j < col; j++) {
                if(min > matrix[i][j])
                    min = matrix[i][j];
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.print("-- "+ min + "\n");    //Print the seperator symbol "--" with the minimum values...
        }
        
        for(int i = 0; i < col; i++)        //Print the seperator symbol "|" ...
            System.out.print("|\t");
        System.out.println();
        
        for(int j = 0; j < col; j++) {      //Print the column wise minimum values...
            int i = 0;
            int min = matrix[i][j];
            for(; i < rows; i++) {
                if(min > matrix[i][j])
                    min = matrix[i][j];
            }
            System.out.print(min + "\t");
        }
    }
}