//program to calculate area of shapes

import java.util.Scanner;

class Shape
{
    float area;

    public void showArea()
    {
        System.out.print("\nArea is " + area);
    } 
}

class Circle extends Shape
{
    float radius;

    Circle(float radius)
    {
        this.radius = radius;
        final float PI = 3.14f;
        area = PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    float length;
    float breadth;

    Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
        area = length * breadth;
    }
}

public class Area_of_Shapes_2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter the Radius of the Circle - ");
        float r = scan.nextFloat();
        Circle circle = new Circle(r);
        circle.showArea();
        
        System.out.print("\n\nEnter the Length of the Rectangle - ");
        float l = scan.nextFloat();
        System.out.print("Enter the Breadth of the Rectangle - ");
        float b = scan.nextFloat();
        Rectangle rectangle = new Rectangle(l, b);
        rectangle.showArea();
        scan.close();
    }  
}