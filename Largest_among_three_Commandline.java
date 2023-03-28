//program to find largest among three numbers using commandline arguments

public class Largest_among_three_Commandline
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        if(a > b && a > c)
        {
            System.out.println(+ a + " is the Largest Number");
        }
        else if(b > a && b > c)
        {
            System.out.println(+ b + " is the Largest Number");
        }
        else
        {
            System.out.println(+ c + " is the Largest Number");
        }
    }
}