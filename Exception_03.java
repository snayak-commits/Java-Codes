//program to catch Number Format Exception

public class Exception_03
{
    public static void main(String[] args) 
    {
        String str = "traxx";

        try
        {
            int s = Integer.parseInt(str);
            System.out.print(s);
            System.out.print("Exception Found!!!");
        }

        catch(Exception e)
        {
            System.out.print("String " + str + " cannot be converted into an Integer...");
            System.out.print("\nThe Exception Caught is " + e);
        }
        System.out.print("\nNo Expections Found...");
    }
}