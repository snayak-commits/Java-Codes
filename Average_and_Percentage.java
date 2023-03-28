//program to calculate the average and percentage of a student

import java.util.Scanner;

public class Average_and_Percentage
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Name - ");
        String name = scan.nextLine();
        System.out.print("Enter the Roll Number - ");
        int roll = scan.nextInt();
        System.out.print("\n");
        System.out.print("------- Enter the Marks -------");
        System.out.println("\n");
        System.out.print("Mathematics: ");
        float mark1 = scan.nextFloat();
        System.out.print("Physics: ");
        float mark2 = scan.nextFloat();
        System.out.print("Chemistry: ");
        float mark3 = scan.nextFloat();
        System.out.print("Computer Science: ");
        float mark4 = scan.nextFloat();
        System.out.print("English: ");
        float mark5 = scan.nextFloat();
        float total = mark1 + mark2 + mark3 + mark4 + mark5;
        float average = total / 5;
        float percentage = (total / 500) * 100;
        System.out.print("\n\n");
        System.out.print("---------- Details ----------");
        System.out.println("\n");
        System.out.println("Name of the Student - " + name);
        System.out.println("Roll Number - " + roll);
        System.out.println("Total Marks Scored - " + total);
        System.out.println("Average - " + average);
        System.out.println("Percentage - " + percentage);
        System.out.println("\n");
        scan.close();
    }
}