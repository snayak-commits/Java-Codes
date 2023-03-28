//program to find factorial of an integer

import java.util.Scanner;

public class Factorial 
{
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer - ");
        int num = scan.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of "+ num +" is " + fact);
        scan.close();
    }
}