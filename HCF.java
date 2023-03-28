//program to print HCF of input integers

import java.util.Scanner;

public class HCF
{
    public static void main(String[] args)
    {
        int HCF = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first integer - ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second integer - ");
        int num2 = scan.nextInt();
        for(int i = 1; i <= num1 || i <= num2; i++)
        {
            if(num1 % i == 0 && num2 % i == 0)
            {
                HCF = i;
            }
        }
        System.out.print("Highest Common Factor of " + num1 + " and " + num2 + " is " + HCF);
        scan.close();
    }
} 