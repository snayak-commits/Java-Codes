//program to calculate area and perimeter of a circle

import PKG_Geometry.Circle;
import java.util.Scanner;

public class Package_02 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle - "); 
        float radius = scan.nextFloat();
        Circle c = new Circle();
        c.setRadius(radius);
        System.out.print("\nArea of the Circle is " + c.getArea());
        System.out.print("\nPerimeter of the Circle is " + c.getPerimeter());
        scan.close();
    }
}