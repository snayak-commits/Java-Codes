//program to illustrate the implementation of Packages

import PKG_Summation.Number;
import java.util.Scanner;

public class Package_01
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int num = scan.nextInt();
        scan.close();

        Number n = new Number(num);
        if(n.Even())
        {
            int square = num * num;
            System.out.print("\n");
            System.out.print(num + " is Even. Its square is " + square);
            System.out.println("\n");
        }
        else
        {
            int cube = num * num * num;
            System.out.print("\n");
            System.out.print(num + " is Odd. Its cube is " + cube);
            System.out.println("\n");
        }  
    }  
}