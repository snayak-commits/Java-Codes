//program to demonstrate try, catch and finally keywords

import java.util.Scanner;

public class Exception_04
{
    public static void main(String[] args)
    {
        int div;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int a = scan.nextInt();
        System.out.print("Enter another number - ");
        int b = scan.nextInt();
        
        try
        {
            div = a / b;
            System.out.print("\nThe value is " + div);
        }

        catch(Exception e)
        {
            System.out.print("\nThe Exception Caught is " + e);
        }
        
        finally
        {
            System.out.print("\n\nProgram ended successfully...");
        }

        System.out.print("\nMain Method ended successfully...");
        scan.close();
    }
}