//Number Class inside Package Summation

package PKG_Summation;

public class Number
{
    int value;

    public Number(int value)
    {
        this.value = value;
    }

    public boolean Even()
    {
        return(value % 2 == 0);
    }
}