//program to swap largest and smallest using member functions

import java.util.Scanner;

class Swap_largest_and_smallest
{   
    int n;
    int arr[];
    public void read()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements - ");
        n = scan.nextInt();
        arr = new int[n];
        System.out.print("Enter the elements - ");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = scan.nextInt();
        }
        scan.close();
    }

    public void swap()
    {
        int max = 0, min = 0;
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] > arr[max]) 
            {
                max = i;
            }
            if(arr[i] < arr[min]) 
            {
                min = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
    }

    public void display()
    {
        System.out.print("Array after Swapping - ");
        for(int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        Swap_largest_and_smallest obj = new Swap_largest_and_smallest();
        obj.read();
        obj.swap();
        obj.display();
    }
}