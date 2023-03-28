//program to sort an array of integers

import java.util.Scanner;
import java.util.Arrays;

public class Sorting_an_Array_of_Integers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements - ");
        int len = scan.nextInt();
        int num[] = new int[len];
        System.out.print("Enter "+ len +" Integer(s) - ");
        for(int i = 0; i < len; i++)
        {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        System.out.println("\nSorted Array - " + Arrays.toString(num));
        System.out.print("\n");
        scan.close();      
    }
}