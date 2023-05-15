//program to copy the information from one file to the other

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Handling_05 
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream r = new FileInputStream("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_01.txt");
        FileOutputStream w = new FileOutputStream("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_03.txt");

        int i;
        while((i = r.read()) != -1)
        {
            w.write((char) i);
        }
        System.out.print("Copied Succesfully...");
    } 
}