//program to calculate the sum of each diagonal elements in a 3 X 3 Matrix

import java.util.Scanner;

public class Sum_of_Diagonal_Elements_in_Matrix 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int sumOfRight = 0, sumOfLeft = 0;
        System.out.println("Enter the elements of the martix - ");
        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 3; j++) 
            {
                matrix[i][j] = scan.nextInt();
                if(i == j)
                {
                    sumOfLeft = sumOfLeft + matrix[i][j];
                }
                if((i + j) == 2)
                {
                    sumOfRight = sumOfRight + matrix[i][j];
                }   
            }
        }
        scan.close();

        System.out.println("\n3 X 3 Matrix - ");
        for(int i = 0; i < 3; i++) 
        {
            for(int j = 0; j < 3; j++) 
            {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nSum of Left Diagonal is " + sumOfLeft);
        System.out.print("\nSum of Right Diagonal is " + sumOfRight);
    }
}