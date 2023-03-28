//program to design a bank account

import java.util.Scanner;

class Account
{
    String num;
    String type;
    String name;
    long balance;
    Scanner scan = new Scanner(System.in);

    public void create()
    {
        System.out.println("\t");
        System.out.print("Enter Account Number - ");
        num = scan.nextLine();
        System.out.print("Enter Account Type - ");
        type = scan.nextLine();
        System.out.print("Enter Account Holder's Name - ");
        name = scan.nextLine();
        System.out.print("Enter Balance - ");
        balance = scan.nextLong();
    }

    public void deposit()
    {
        System.out.print("\nEnter the amount you want to deposit - ");
        long amount = scan.nextLong();
        balance = balance + amount;
        System.out.print("\nCurrent Account Balance: Rs. " + balance);
        System.out.println("\t");
    }

    public void withdraw()
    {
        System.out.print("\nEnter the amount you want to withdraw - ");
        long amount = scan.nextLong();
        if(amount > balance)
        {
            System.out.print("\nAmount cannot be withdrawn as it will leave insufficient funds in the account. Please add funds to the account...");
            System.out.println("\t");
        }
        else if((balance - amount) < 500)
        {
            System.out.print("\nAccount balance dropped below Rs.500. Transaction Failed!!!");
            System.out.println("\t");
        }
        else
        {
            balance = balance - amount;
            System.out.print("\nCurrent Account Balance: Rs. " + balance);
            System.out.println("\t");
        }
    }

    public boolean search(String acc_num) 
    {  
        if (num.equals(acc_num)) 
        {  
            display();  
            return true;  
        }
        else
        {
            return false; 
        }  
    }  

    public void display()
    {
        System.out.print("\nAccount Number - " + num);
        System.out.print("\nAccount Type - " + type);
        System.out.print("\nAccount Holder's Name - " + name);
        System.out.print("\nAccount Balance - Rs. " + balance);
        System.out.println("\t");
    }
}

public class Bank_Account
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many users you want to input? ");
        int n = scan.nextInt(); 
        Account A[] = new Account[n];
        for(int i = 0; i < A.length; i++)
        {
            A[i] = new Account();
            A[i].create();

        }
        
        int choice;
        do
        {
            System.out.println("\t");
            System.out.println("\t");
            System.out.println("---------- Bank Account ----------");
            System.out.println("1. Display all Account Details");
            System.out.println("2. Search by Account Number");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Exit");
            System.out.print("Enter your desired choice - ");
            choice = scan.nextInt();

            switch(choice)
            {
                case 1:
                for(int i = 0; i < A.length; i++)
                {
                    A[i].display();
                }
                break;

                case 2:
                System.out.print("\nEnter the account number you wanna search - ");
                String acc_num = scan.next();
                boolean found  = false;
                for(int i = 0; i < A.length; i++)
                {
                    found = A[i].search(acc_num);
                    if(found)
                    {
                        break;
                    }
                }
                if(!found)
                {
                    System.out.println("\nSearch failed! Account doesn't exist...");  
                }
                break;

                case 3:
                System.out.print("\nEnter Account Number - ");
                acc_num = scan.next();
                found = false;
                for(int i = 0; i < A.length; i++)
                {
                    found = A[i].search(acc_num);
                    if(found)
                    {
                        A[i].deposit();
                        break;
                    }
                }
                if(!found)
                {
                    System.out.println("\nSearch failed! Account doesn't exist...");
                }
                break;

                case 4:
                System.out.print("\nEnter Account Number - ");  
                acc_num = scan.next();  
                found = false;  
                for(int i = 0; i < A.length; i++) 
                {
                    found = A[i].search(acc_num);  
                    if(found)
                    {  
                        A[i].withdraw();  
                        break;  
                    }  
                }  
                if(!found)
                {  
                    System.out.println("\nSearch failed! Account doesn't exist..!!");  
                }  
                break;
                
                case 5:
                System.out.println("\n------------- Ending -------------");
                break;
            }
        }
        while(choice != 5);
        scan.close();
    }
}