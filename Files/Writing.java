package Files;

import java.io.*;

public class Writing
{
    public static void main(String[] args)
    {
        try{
            FileWriter fw = new FileWriter("Test");
            fw.write("Dekh kya raha hai \n");
            fw.write("fjlkjflk");
            System.out.println("Success");
            fw.close();
            }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
