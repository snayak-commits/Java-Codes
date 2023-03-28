//program to print area of a triangle using Heron's Formula

import java.util.Scanner;
import java.lang.Math;

public class Herons_Formula 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a - ");
        double a = scan.nextDouble();
        System.out.print("Enter the value of b - ");
        double b = scan.nextDouble();
        System.out.print("Enter the value of c - ");
        double c = scan.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println( "Area of the Triangle is  " + area);
        scan.close();
    }
}