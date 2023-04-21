//program to demonstrate multiple catch blocks

public class Exception_06
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.print("The value is " + c);

            int arr[] = {10, 20, 30, 40, 50};
            System.out.print("\nThe array is " + arr[1]);

            String str = "traxx";
            System.out.print("\n");
            System.out.print(str.toUpperCase());
        }

        catch(ArithmeticException a)
        {
            System.out.print("\nArithmetic Exception");
        }
        
        catch(ArrayIndexOutOfBoundsException ai)
        {
            System.out.print("\nArray Index Out Of Bounds Exception");
        }

        catch(NullPointerException n)
        {
            System.out.print("\nNull Pointer Exception");
        }

        catch(Exception e)
        {
            System.out.print("\nThe Exception Caught is " + e);
        }
        
        finally
        {
            System.out.print("\n\nProgram ended successfully...");
        }
    }
}