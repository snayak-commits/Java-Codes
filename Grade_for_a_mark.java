//program to print grade for a corresponding mark

import java.util.Scanner;

public class Grade_for_a_mark
{
    public static void Grade(int mark)
    {
        if(mark >= 91 && mark <= 100)
        {
            System.out.print("You've secured O Grade"); 
        }
        else if(mark >= 81 && mark <= 90)
        {
            System.out.print("You've secured E Grade"); 
        }
        else if(mark >= 71 && mark <= 80)
        {
            System.out.print("You've secured A Grade"); 
        }
        else if(mark >= 61 && mark <= 70)
        {
            System.out.print("You've secured B Grade"); 
        }
        else if(mark >= 51 && mark <= 60)
        {
            System.out.print("You've secured C Grade"); 
        }
        else if(mark >= 41 && mark <= 50)
        {
            System.out.print("You've secured D Grade"); 
        }
        else
        {
            System.out.print("Your Grade is E"); 
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a mark - ");
        int mark = scan.nextInt();
        Grade(mark);
        scan.close();
    }
}