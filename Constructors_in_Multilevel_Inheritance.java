//program to illustrate the execution of multilevel inheritance

class Plate
{
    float length; 
    float width;

    Plate(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
}

class Box extends Plate
{
    float height;

    Box(float length, float width, float height)
    {
        super(length, width);
        this.height = height;
    }
}

class Woodbox extends Box
{
    float thickness;

    Woodbox(float length, float width, float height, float thickness)
    {
        super(length, width, height);
        this.thickness = thickness;
    }
}

public class Constructors_in_Multilevel_Inheritance
{
    public static void main(String[] args) 
    {
        Woodbox w1 = new Woodbox(2.2f, 2.3f, 4.2f, 1.1f);
        System.out.println(w1.length);
        System.out.println(w1.width);
        System.out.println(w1.height);
        System.out.println(w1.thickness);
    } 
}
