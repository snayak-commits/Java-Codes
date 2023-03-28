//program to overload subtract method with various parameters

import java.util.Scanner;

public class Overload_Subtract_method
{
    public static int subtract(int a, int b)
    {
        return a - b;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number - ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third number - ");
        int num3 = scan.nextInt();
        System.out.print("Enter the fourth number - ");
        int num4 = scan.nextInt();
        System.out.print("\n");
        System.out.print(+ num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.print("\n");
        System.out.print(+ num3 + " - " + num4 + " = " + subtract(num3, num4));
        scan.close();
    }
}