//program to demonstrate the use of super keyword to invoke parent class parameterized constructor

class X
{
    X(int n)
    {
        System.out.print(n);
    }
}

class Y extends X
{
    Y()
    {
        super(77);
    }
}

public class super_keyword_parameterized_constructor
{
    public static void main(String[] args)
    {
        Y y = new Y();
    } 
}