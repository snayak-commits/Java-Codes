//program to demonstrate a user defined exception

class NoTriangleFormException extends Exception 
{
    public NoTriangleFormException(String message) 
    {
        super(message);
    }
}

class Triangle 
{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws NoTriangleFormException 
    {
        if (a + b <= c || b + c <= a || c + a <= b) 
        {
            throw new NoTriangleFormException("Cannot form a triangle with these sides...");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() 
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() 
    {
        return a + b + c;
    }
}

public class Exception_09
{
    public static void main(String[] args) 
    {
        try 
        {
            Triangle t1 = new Triangle(3, 4, 5);
            System.out.println("Area of T1: " + t1.area());
            System.out.println("Perimeter of T1: " + t1.perimeter());

            Triangle t2 = new Triangle(2, 2, 5);
            System.out.println("Area of T2: " + t2.area());
            System.out.println("Perimeter of T2: " + t2.perimeter());
        } 
        
        catch(NoTriangleFormException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}