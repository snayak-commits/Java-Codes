//program to demonstrate Single Inheritance

import java.util.Scanner;

class Two_Dimension
{
    double cost = 40;
    double cost(double area)
    {
        return area * cost;
    }
}

class Three_Dimension extends Two_Dimension
{
    double cost = 60;
    double cost(double area, double height)
    {
        return area * height * cost;
    }
}

public class Single_Inheritance
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Two_Dimension sheet = new Two_Dimension();
        Three_Dimension box = new Three_Dimension();
        System.out.print("\nEnter an Area - ");
        double area = scan.nextDouble();
        System.out.print("Enter a Height - ");
        double height = scan.nextDouble();
        System.out.print("\nCost of the Sheet is Rs. " + sheet.cost(area));
        System.out.print("\nCost of the Box is Rs. " + box.cost(area, height));
        Two_Dimension plastic = new Three_Dimension();
        System.out.print("\nCost of the Plastic is Rs. " + plastic.cost(area));
        scan.close();
    }
}