//program to illustrate the usage of Abstract Class

import java.util.Scanner;

abstract class Student
{
    int roll;
    long reg;
    abstract void course(String course, String univ);
    
    Student(int roll, long reg)
    {
        this.roll = roll;
        this.reg = reg;
    }  
}

class University extends Student
{
    University(int roll, long reg) 
    {
        super(roll, reg);
    }

    void course(String course, String univ)
    {
        System.out.print("\nRoll Number: " + roll);
        System.out.print("\nRegistration Number: " + reg);
        System.out.print("\n");
        System.out.print("This " + course + " Course is provided by " + univ);
        System.out.print("\n");
    }
}

public class Abstract_Student
{
    public static void main(String[] args)
    {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter a Roll Number - ");
        int roll = scan.nextInt();
        System.out.print("Enter a Registration Number - ");
        long reg = scan.nextLong();
        System.out.print("Enter the name of the Course - ");
        String course = scan.nextLine();
        System.out.print("\nEnter the name of the University - ");
        String univ = scan.nextLine();
        University u1 = new University(roll, reg);
        u1.course(course, univ);
        scan.close();
    }
}