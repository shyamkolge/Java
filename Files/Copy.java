package Files;

import  java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy
{
    public static void main(String[] args)
    {
        Path source = Paths.get("C:\\Users\\Lenovo\\Desktop\\Shyam");
        Path destination = Paths.get("C:\\Users\\Lenovo\\Desktop\\Third Sem\\Shyam");

        try
        {
            Files.copy(source,destination);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
