package OverloadingAndOverriding;

class Parent
{
    void health()
    {
        System.out.println("healthy person");
    }
}

class Child extends Parent
{
    void health()
    {
        System.out.println("less healthy person");
    }
}


public class MethodOverriding
{
    public static void main(String[] args)
    {
       Child c = new Child();
        c.health();

    }
}
