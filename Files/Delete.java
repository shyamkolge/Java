package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Delete
{
    public static void main(String[] args)
    {
        try {
             Path Source = Paths.get("C:\\Users\\Lenovo\\Desktop\\Shyam");

              Files.delete(Source);
            }
         catch (Exception e)
         {
             System.out.println(e);
         }
    }

}
