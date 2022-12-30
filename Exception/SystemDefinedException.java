package Exception;

public class SystemDefinedException
{
    public static void main(String[] args)
    {
        int num = 10;
        int ans;

        try
        {
            ans = num/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("You can not divide any number with zero");
        }

        finally
        {
            System.out.println("This block will execute either exception is handal or not ");
        }

    }
}
