//program to demonstrate the use of throws keyword

public class Exception_08
{
    public static void main(String[] args) throws InterruptedException
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.print(i + " ");
            Thread.sleep(1000);   
        }
    }
}