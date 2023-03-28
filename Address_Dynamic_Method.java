//program to display address using dynamic method dispatch

import java.util.Scanner;

class Address
{
    String address;
    Scanner scan = new Scanner(System.in);

    public void setAddress()
    {
        System.out.print("Enter your Address - ");
        address = scan.nextLine();
    }

    public void getAddress()
    {
        System.out.print("\nAddress - " + address);
    }
}

class Home_Address extends Address
{
    public void setAddress()
    {
        System.out.print("\nEnter your Home Address - ");
        address = scan.nextLine();
    }

    public void getAddress()
    {
        System.out.print("\nHome Address - " + address);
    }
}

class Office_Address extends Address
{
    public void setAddress()
    {
        System.out.print("\nEnter your Office Address - ");
        address = scan.nextLine();
    }

    public void getAddress()
    {
        System.out.print("\nOffice Address - " + address);
    }
}

class School_Address extends Address
{
    public void setAddress()
    {
        System.out.print("\nEnter your School Address - ");
        address = scan.nextLine();
    }

    public void getAddress()
    {
        System.out.print("\nSchool Address - " + address);
    }
}

public class Address_Dynamic_Method
{
    public static void main(String[] args)
    {
        Address a1 = new Address();
        a1 = new Home_Address();
        a1.setAddress();
        a1.getAddress();
        System.out.println("\t");
        a1 = new Office_Address();
        a1.setAddress();
        a1.getAddress();
        System.out.println("\t");
        a1 = new School_Address();
        a1.setAddress();
        a1.getAddress();
    }
}