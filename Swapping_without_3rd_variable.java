//program to swap numbers without using third variable

import java.util.Scanner;

public class Swapping_without_3rd_variable
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a - ");
        int a = scan.nextInt();
        System.out.print("Enter the value of b - ");
        int b = scan.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a is  " + a);
        System.out.println("b is  " + b);
        scan.close();
    }
}