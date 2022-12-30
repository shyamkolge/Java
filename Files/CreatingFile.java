package Files;
import java.io.File;
import java.io.IOException;

public class CreatingFile
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Lenovo\\Desktop\\hello.txt");

        try
        {
            if(f.createNewFile())
            {
                System.out.println("File is created at "+f.getPath());
            }
            else
            {
                System.out.println("File already exist at "+f.getPath());
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }





}
