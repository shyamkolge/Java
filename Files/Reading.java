package Files;

import java.io.FileReader;

public class Reading
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr = new FileReader("Test");

            int i;
            while((i= fr.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
