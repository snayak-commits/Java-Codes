//program to find even or odd among ten input numbers using commandline arguments

public class Even_Odd_Commandline
{
    public static void even_odd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(+ num + " is an Even Number");
        }
        else
        {
            System.out.println(+ num + " is an Odd Number");
        }
    }

    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        even_odd(a);
        int b = Integer.parseInt(args[1]);
        even_odd(b);
        int c = Integer.parseInt(args[2]);
        even_odd(c);
        int d = Integer.parseInt(args[3]);
        even_odd(d);
        int e = Integer.parseInt(args[4]);
        even_odd(e);
        int f = Integer.parseInt(args[5]);
        even_odd(f);
        int g = Integer.parseInt(args[6]);
        even_odd(g);
        int h = Integer.parseInt(args[7]);
        even_odd(h);
        int i = Integer.parseInt(args[8]);
        even_odd(i);
        int j = Integer.parseInt(args[9]);
        even_odd(j);
    }
}