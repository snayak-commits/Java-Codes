//program to input details of a person in an account

class Account
{
    int acc_no;
    double amount;
    Account(int acc_no, double amount)
    {
        this.acc_no = acc_no;
        this.amount = amount;
    }
    public void display()
    {
        System.out.println("A/C: "+ acc_no +"\nAmount: Rs. "+ amount);
    }
}

class Person extends Account
{
    String name, aadhar_no;
    Person(int acc_no, double amount, String name, String aadhar_no)
    {
        super(acc_no, amount);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }

    public void display()
    {
        super.display();
        System.out.println("Account Holder's Name: "+ name);
        System.out.println("Account Holder's Aadhar: "+ aadhar_no);
        System.out.println("\n---------------------------------------------------\n");
    }

}
public class Account_Credentials
{
    public static void main(String[] args)
    {
        Person p1 = new Person(1, 3000, "sinatraa", "0000000000");
        Person p2 = new Person(2, 6000.89, "tarik", "1111111111");
        Person p3 = new Person(3, 5000.99, "yay", "2222222222");
        Person p4 = new Person(4, 8000.75, "TenZ", "3333333333");
        Person p5 = new Person(5, 6000.22, "traxx", "7777777777");
        
        p1.display(); 
        p2.display(); 
        p3.display(); 
        p4.display(); 
        p5.display(); 
    }
}