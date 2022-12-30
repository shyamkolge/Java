package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move
{
    public static void main(String[] args) {
        try
        {
            Path source = Paths.get("C:\\Users\\Lenovo\\Desktop\\Shyam");
            Path destination = Paths.get("C:\\Users\\Lenovo\\Desktop\\Shyam\\");

            Files.move(source,destination);
        }
       catch (Exception e)
       {
           System.out.println(e);
       }



    }

}
