//program to add two numbers

import java.util.Scanner;

public class Add_Two_Numbers
{
    public static int add(int num1, int num2)
    {
        return(num1 + num2);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = scan.nextInt();
        int sum = add(num1, num2);
        System.out.print("The Sum of the two input integers is " + sum);
        System.out.println("\n");
        scan.close();
    }
}