//program to demonstrate nested try blocks

public class Exception_07
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.print("\nThe value is " + c);

            try
            {
                String str = "traxx";
                System.out.print("\n");
                System.out.print(str.toUpperCase());

                int arr[] = {10, 20, 30};
                System.out.print("\nThe array is " + arr[1]);
            }
            catch(NullPointerException n)
            {
                System.out.print("\nNull Pointer Exception");
            }
            
            catch(ArrayIndexOutOfBoundsException ai)
            {
                System.out.print("\nArray Index Out Of Bounds Exception");
            }
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
    }
}