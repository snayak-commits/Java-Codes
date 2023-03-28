//program to demonstrate the Constructor Overloading Concept

class Constructor
{
    int id;
    String name;
    String job;

    Constructor(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    Constructor(int id, String name, String job)
    {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    void display()
    {
        System.out.print("------- Details -------\n");
        System.out.print("ID - " + id);
        System.out.print("\nName - " + name);
        System.out.print("\nJob - " + job);
    }   
}

public class Constructor_Overloading
{
    public static void main(String[] args)
    {
        Constructor c1 = new Constructor(169, "traxx");
        Constructor c2 = new Constructor(177, "traxx", "Programmer");
        c1.display();
        System.out.println("\n");
        c2.display();
    }
}