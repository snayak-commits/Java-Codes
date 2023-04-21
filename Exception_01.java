//program to demonstrate Exception Handling

public class Exception_01
{
    public static void main(String[] args)
    {
        int a = 77;
        int b = 0;
        int c;

        try
        {
            c = a / b;
            System.out.print("The value of c is " + c);
        }

        catch(Exception e)
        {
            System.out.print("Unable to divide by Zero...");
            System.out.print("\nThe Exception Caught is " + e);
        } 
    }   
}