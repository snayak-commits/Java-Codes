//program to print prime factors of input integers

import java.util.Scanner;

public class Prime_Factors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer - ");
        int num = scan.nextInt();
        System.out.print("Prime Factors - ");
        for(int i = 2; i <= num; i++)
        {
            while(num % i == 0)
            {
                num = num / i;
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}