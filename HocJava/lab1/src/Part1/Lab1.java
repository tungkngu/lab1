
package Part1;

import java.util.Scanner;

public class Lab1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = input.nextInt();
        System.out.print("Enter the number of row: ");
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the matrix");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.format("m[%d][%d]: ", i,j);
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix inputed: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                sum += (matrix[i][j]);
            }
        }
        System.out.print(sum);
        System.out.println("Average:" +(float)sum/(row*column));
    }
    
}
