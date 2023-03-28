//program to check whether an input integer is prime or composite

import java.util.Scanner;

public class Prime_or_Composite 
{
    public static void main(String[] args)
    {
        int flag = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer - ");
        int num = scan.nextInt();
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                flag++;
            }
        }
        if(flag == 2)
        {
            System.out.println(""+ num +" is a Prime Number");
        }
        else if(num == 0 || num == 1)
        {
            System.out.println(""+ num +" is neither Prime nor Composite");
        }
        else
        {
            System.out.println(""+ num +" is a Composite Number");
        }
        scan.close();
    }
}