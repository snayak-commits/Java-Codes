//program to create and interface and check the value of interface data member through an object of the class

interface Motor
{
    int capacity = 50;
    void run();
    void consume();
}

class Washing_Machine implements Motor
{
    public void run()
    {
        System.out.println("Washing Machine is running...");
    }

    public void consume()
    {
        System.out.println("Washing Machine is consuming...");
    }

    public void display()
    {
        System.out.println("\nWashing Machine can hold upto " + capacity + " kilograms\n");
    }
}

public class Interface_01
{
    public static void main(String[] args)
    {
        Washing_Machine mach = new Washing_Machine();
        mach.run();
        mach.consume();
        mach.display();
    }
}