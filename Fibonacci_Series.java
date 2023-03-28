//program to print Fibonacci Series

import java.util.Scanner;

public class Fibonacci_Series
{
    public static void main(String[] args)
    {
        int a = 0, b = 1, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci Series upto? ");
        int num = scan.nextInt();
        System.out.print("Fibonacci Series till " + num + " terms - ");
        for(int i = 1; i <= num; i++)
        {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        scan.close();
    }
}