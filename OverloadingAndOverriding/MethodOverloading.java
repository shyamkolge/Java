package OverloadingAndOverriding;
class Adder
{
    public  int Add(int a,int b)
    {
        return a+b;
    }

    public int Add(int a,int b, int c)
    {
        return a+b+c;
    }

    public int Add(int a,int b, int c,int d)
    {
        return a+b+c+d;
    }
}

public class MethodOverloading
{
    public static void main(String[] args)
    {
        Adder ad = new Adder();

        System.out.println(ad.Add(1,2));
        System.out.println(ad.Add(1,2,3));
        System.out.println(ad.Add(1,2,3,4));
    }
}
