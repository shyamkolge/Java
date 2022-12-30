package Inheritance;

interface Price
{
    void showPrice();
}

interface Amount
{
    void showPrice();
}

public class MultipleInheritance implements Price,Amount
{
    public void showPrice()
    {
        System.out.println("Price is $100");
    }

    public static void main(String[] args)
    {
        MultipleInheritance ml = new MultipleInheritance();
        ml.showPrice();
    }
}
