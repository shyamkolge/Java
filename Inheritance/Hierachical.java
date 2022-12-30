package Inheritance;

class Animal
{
    void walk()
    {
        System.out.println("can walk");
    }
}

class cat extends Animal
{
    void walk()
    {
        System.out.println("can walk slowly");
    }
}

class dog extends Animal
{
    void walk()
    {
        System.out.println("Can walk fast");
    }
}
public class Hierachical
{
    public static void main(String[] args) {
        Animal a = new Animal();
        cat c = new cat();
        dog d = new dog();

        a.walk();
        c.walk();
        d.walk();
    }
}
