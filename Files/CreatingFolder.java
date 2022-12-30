package Files;

import java.io.File;

public class CreatingFolder
{
    public static void main(String[] args)
    {
        File f = new File("C:\\Users\\Lenovo\\Desktop\\Shyam");

           if(f.mkdir())
           {
               System.out.println("File is created at "+f.getPath());
           }
           else
           {
               System.out.println("File is already exist"+ f.getPath());
           }

    }

}
