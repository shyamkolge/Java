package Exception;

import java.util.Scanner;
class UserException extends Exception
{

    public String getMessage()
    {
        return "You are not able for voting";
    }

    //We can use following block also

/*  public UserException(String sr)
   {
       super(sr);
    }
*/
}
public class UserDefinedException
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter your age ");
        age = sc.nextInt();

        try
        {
            if(age<=18)
            {
                throw new UserException();
            }
            else
            {
                System.out.println("You can vote");
            }
        }
        catch (UserException e)
        {
               System.out.println(e); // It calls to getMessage() method
        }

    }
}
