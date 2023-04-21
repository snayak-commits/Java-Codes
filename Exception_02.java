//program to catch Null Point Exception

public class Exception_02 
{
    public static void main(String[] args) 
    {
        String str = null;

        try
        {
            System.out.print(str.toUpperCase());
        }

        catch(Exception e)
        {
            System.out.print("Null cannot be casted...");
            System.out.print("\nThe Exception Caught is " + e);
        }   
    }  
}