//program to input and display the details of students and also display the name of the student having lowest CGPA

import java.util.Scanner;

class Student
{
    int roll;
    String name;
    float CGPA;

    Student(int roll, String name, float CGPA)
    {
        this.roll = roll;
        this.name = name;
        this.CGPA = CGPA;
    }

    void display() 
    {
        System.out.print("Roll - " + roll);
        System.out.print("\nName - " + name);
        System.out.print("\nCGPA - " + CGPA);
    }
}

public class Student_Information
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of student(s) - ");
        int n = scan.nextInt();
        Student students[] = new Student[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("\nEnter details of the student " + (i + 1));
            System.out.print("Roll - ");
            int roll = scan.nextInt();
            System.out.print("Name - ");
            String name = scan.next();
            System.out.print("CGPA - ");
            float CGPA = scan.nextFloat();
            students[i] = new Student(roll, name, CGPA);
        }
        float min = students[0].CGPA;
        int minIndex = 0;
        for(int i = 1; i < n; i++) 
        {
            if(students[i].CGPA < min) 
            {
                min = students[i].CGPA;
                minIndex = i;
            }
        }
        System.out.println("\nStudent with lowest CGPA:");
        students[minIndex].display();
        scan.close();
    }
}