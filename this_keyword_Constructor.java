//program to demonstrate the implementation of this keyword to invoke default constructor from parameterized constructor

class X
{
    X()
    {
        System.out.print("This is CSE - ");
    }

    X(int n)
    {
        this();
        System.out.print(n);
    }
}

public class this_keyword_Constructor
{
    public static void main(String[] args)
    {
        X x = new X(22);        
    }
}