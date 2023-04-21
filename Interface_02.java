//program to find sum and average of two numbers using interface

import java.util.Scanner;

interface Numbers
{
    int process(int x, int y);
}

class Sum implements Numbers
{
    public int process(int x, int y)
    {
        return x + y;
    }
}

class Average implements Numbers
{
    public int process(int x, int y)
    {
        return (x + y) / 2;
    }
}

public class Interface_02
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number - ");
        int a = scan.nextInt();
        System.out.print("Enter another number - ");
        int b = scan.nextInt();

        Numbers sum = new Sum();
        System.out.print("\nSum of the two numbers is " + sum.process(a, b));
        Numbers avg = new Average();
        System.out.print("\nAverage of the two numbers is " + avg.process(a, b));
        scan.close();
    }  
}