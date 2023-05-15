//program to read the information from a file

import java.io.FileReader;
import java.io.IOException;

public class File_Handling_04 
{
    public static void main(String[] args) throws IOException
    {
        FileReader f = new FileReader("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_02.txt");

        try
        {
            int i;
            while((i = f.read()) != -1)
            {
                System.out.print((char) i);
            }
        }
        
        finally
        {
            f.close();
        }
    } 
}