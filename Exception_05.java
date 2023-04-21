//program to demonstrate multiple try, catch blocks

import java.util.Scanner;

public class Exception_05
{
    public static void main(String[] args)
    {        
        try
        {
            int div;

            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number - ");
            int a = scan.nextInt();
            System.out.print("Enter another number - ");
            int b = scan.nextInt();
            div = a / b;
            System.out.print("\nThe value is " + div);
            scan.close();
        }

        catch(ArithmeticException a)
        {
            System.out.print("\nThe Exception Caught is " + a);
        }

        try
        {
            String str = null;
            System.out.print(str.toUpperCase());
        }

        catch(NullPointerException n)
        {
            System.out.print("Null cannot be casted...");
            System.out.print("\nThe Exception Caught is " + n);
        }
        
        finally
        {
            System.out.print("\n\nProgram ended successfully...");
        }
    } 
}
