//program to display the information of a file

import java.io.File;

public class File_Handling_02
{
    public static void main(String[] args) 
    {
        File f = new File("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_01.txt");

        if(f.exists())
        {
            System.out.print("File Name: " + f.getName());
            System.out.print("\nFile Location: " + f.getAbsolutePath());
            System.out.print("\nFile Size: " + f.length());
            System.out.print("\nIs the file readable? " + f.canRead());
            System.out.print("\nIs the file writable? " + f.canWrite());
        }

        else
        {
            System.out.print("File doesn't exist...");
        }    
    }
}