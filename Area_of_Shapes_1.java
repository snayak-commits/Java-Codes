//menu driven program to calculate area of shapes

import java.util.Scanner;

class Area_of_Shapes_1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n------- AREA -------");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.print("Enter your desired choice - ");
        int choice = scan.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("\nEnter Radius - ");
                float r = scan.nextFloat();
                System.out.println("Area of Circle - " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("\nEnter Side - ");
                float s = scan.nextFloat();
                System.out.println("Area of Square - " + (s * s));
                break;

            case 3:
                System.out.print("\nEnter Base - ");
                float b = scan.nextFloat();
                System.out.print("Enter Height - ");
                float h = scan.nextFloat();
                System.out.println("Area of Triangle - " + (0.5 * b * h));
                break;

            default:
                System.out.println("\nInvalid Input!!!");

            scan.close();
        }
    }
}