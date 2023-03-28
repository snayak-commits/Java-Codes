//program to call base class parameterized constructors from derived class

class Base
{
    int x;
    
    Base(int x)
    {
        this.x = x;
    }
}

class Derived extends Base
{
    Derived()
    {
        super(77);
    }

    void display()
    {
        System.out.println("The value of x is " + x);
    }
}

public class Base_Class_parameterized_Constructors
 {
    public static void main(String[] args)
    {
        Derived d = new Derived();
        d.display();
    }
}