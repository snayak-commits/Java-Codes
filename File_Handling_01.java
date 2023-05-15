//program to demonstrate the creation of a file

import java.io.File;
import java.io.IOException;

class File_Handling_01
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_01.txt");
        
        if(f.createNewFile())
        {
            System.out.print("File Created successfully...");
        }

        else
        {
            System.out.print("File couldn't be created...");
        }
    }
}