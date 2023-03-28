//program to add two numbers using commandline arguments

public class Add_Two_Numbers_Commandline
{
    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.print("The sum is " + sum);
    }
}