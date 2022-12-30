package Inheritance;

class GrandFather
{
    void healthG()
    {
        System.out.println("Healthy person");
    }
}

class Parent extends GrandFather
{
    void healthP ()
    {
        System.out.println("less healthy person");
    }
}

class Child extends Parent
{
    void healthC()
    {
        System.out.println("Unhealthy person");
    }
}


public class MultiLevelInheritance
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.healthG();
        c.healthP();
        c.healthC();
    }
}
