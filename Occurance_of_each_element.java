//program to find the number of occurance of each element

import java.util.Scanner;

public class Occurance_of_each_element
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers you wanna enter? ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int occur[] = new int[9999];
        System.out.print("Enter the numbers - ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
            occur[arr[i]]++;
        }
        scan.close();

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[j]=-1;
                }
            }
        }

        System.out.println("\nOccurences - ");
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != -1)
            {
                System.out.println(arr[i] + " occured " + occur[arr[i]] + " time(s)");
            }      
        }
    }
}