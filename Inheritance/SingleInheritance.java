package Inheritance;
class Super
{
    void show()
    {
        System.out.println("this is a super class");
    }
}

class Sub extends Super
{
    void display()
    {
        System.out.println("this is a Sub class");
    }
}

public class SingleInheritance
{
    public static void main(String[] args)
    {
        Sub obj = new Sub();
        obj.show();
        obj.display();

    }
}
