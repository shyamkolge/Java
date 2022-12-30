package DynamicMehodDispatch;

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

public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        Animal a = new Animal();
        cat c = new cat();
        dog d = new dog();

        Animal ref;
        ref = a;
        ref.walk();

        ref=c;
        ref.walk();

        ref=d;
        ref.walk();

    }
}
