//program to concatenate two strings

import java.util.Scanner;

public class String_Concatenation
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string - ");
        String name1 = scan.nextLine();
        System.out.print("Enter second string - ");
        String name2 = scan.nextLine();
        String name = name1 + " " + name2;
        System.out.println("String Concatenated - " + name);
        System.out.print("\n");
        scan.close();
    }
}