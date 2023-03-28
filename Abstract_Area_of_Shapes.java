//program to calculate area of different shapes using abstraction
   
import java.util.Scanner;

abstract class Shape
{
    float dimn1;
    float dimn2;
    abstract float area();

    Shape(float dimn1, float dimn2)
    {
        this.dimn1 = dimn1;
        this.dimn2 = dimn2;
    }  
}

class Circle extends Shape
{
    Circle(float dimn1, float dimn2)
    {
        super(dimn1, dimn2);
    }

    float area()
    {
        final float PI = 3.141f;
        return (PI * dimn1 * dimn1);
    }
}

class Triangle extends Shape
{
    Triangle(float dimn1, float dimn2)
    {
        super(dimn1, dimn2);
    }

    float area()
    {
        return (dimn1 * dimn2) / 2;
    }
}

class Rectangle extends Shape
{
    Rectangle(float dimn1, float dimn2)
    {
        super(dimn1, dimn2);
    }

    float area()
    {
        return dimn1 * dimn2;
    }
}

public class Abstract_Area_of_Shapes 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Radius of a Circle - ");
        float radius = scan.nextFloat();
        Circle c = new Circle(radius, 1);
        System.out.print("\nArea of the Circle is " + c.area());
        System.out.print("\n");

        System.out.print("\nEnter the Base of a Triangle - ");
        float base = scan.nextFloat();
        System.out.print("Enter the Height of a Triangle - ");
        float height = scan.nextFloat();
        Triangle t = new Triangle(base, height);
        System.out.print("\nArea of the Triangle is " + t.area());
        System.out.print("\n");

        System.out.print("\nEnter the Length of a Rectangle - ");
        float length = scan.nextFloat();
        System.out.print("Enter the Breadth of a Rectangle - ");
        float breadth = scan.nextFloat();
        Rectangle r = new Rectangle(length, breadth);
        System.out.print("\nArea of the Rectangle is " + r.area());
        scan.close();
    }
}