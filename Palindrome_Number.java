//program to check for a Pallindrome Number

import java.util.Scanner;

public class Palindrome_Number
{
    public static void main(String[] args)
    {
        int num, reverse = 0, remainder;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a three digit number - ");
        num = scan.nextInt();
        int temp = num;
        while(num != 0)
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        if(temp == reverse)
        {
            System.out.println(""+ temp +" is a Palindrome Number");
        }
        else
        {
            System.out.println(""+ temp +" ain't a Palindrome Number");
        }
        scan.close();
    }
}