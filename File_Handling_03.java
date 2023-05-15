//program to write the information to a file

import java.io.FileWriter;
import java.io.IOException;

public class File_Handling_03
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f = new FileWriter("C:\\Users\\sneha\\OneDrive\\Documents\\Codes\\Java\\File_Handling_Data\\File_02.txt");
        
        try
        {
            f.write("Java is a high-level, class-based, object-oriented programming language.");
        }

        finally
        {
            f.close();
        }   
    }    
}