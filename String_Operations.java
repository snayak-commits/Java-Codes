//program to implement package operations

import java.util.Scanner;

public class String_Operations
{
    public static void main(String[] args)
    {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String - ");
        String str1 = scan.nextLine();
        System.out.print("Enter another String - ");
        String str2 = scan.nextLine();
        System.out.print("\n1. String Uppercase and String Lowercase");
        System.out.print("\n2. String Reversal");
        System.out.print("\n3. String Comparison");
        System.out.print("\n4. Substring Insertion");

        while(flag)
        {
            System.out.print("\nEnter your choice - ");
            int choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                System.out.print("\nOriginal String - " + str1);
                System.out.print("\nUppercase - " + str1.toUpperCase());
                System.out.print("\nLowercase - " + str1.toLowerCase());
                break;

                case 2:
                System.out.print("\nOriginal String - " + str1);
                System.out.print("\nReversed String - " + new StringBuilder(str1).reverse().toString());
                break;

                case 3:
                System.out.print("\nOriginal String - " + str1);
                System.out.print("\nString to compare - " + str2);
                System.out.print("\n\nAre the Strings equal? " + str1.equals(str2));
                break;

                case 4:
                System.out.print("\nOriginal String - " + str1);
                System.out.print("\nString to insert - " + str2);
                System.out.print("\nPut in the index to insert - ");
                int index = scan.nextInt();
                System.out.print("\nAfter Insertion - " + str1.substring(0, index) + str2 + str1.substring(index));
                break;

                default:
                System.out.print("\nInvalid Choice!!!");
            }

            System.out.print("\n\nWanna enter more? (Enter 1 for Yes or 0 for No): ");
            int c = scan.nextInt();

            if(c == 1)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }
        }
    }  
}