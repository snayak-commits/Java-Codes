//program to add n numbers using commandline arguments

public class Add_n_Numbers_Commandline
{
    public static void main(String[] args)
    {
        int sum = 0;
        int len = args.length;
        for(int i = 0; i < len; i++)
        {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.print("The sum is " + sum);
    }
}
