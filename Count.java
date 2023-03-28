//program to find the number of objects created out of a class using static modifier

public class Count
{
    private static int counter;
    
    public Count()
    {
        counter++;
    }

    public static void main(String[] args)
    {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        System.out.println("Total objects created is " + Count.counter);
    }
}