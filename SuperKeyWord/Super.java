package SuperKeyWord;
class Parent
{
    int Age = 34;
    Parent()
    {
        System.out.println("This is parent class");
    }
    void money()
    {
        System.out.println("Have money");
    }

    void cloths()
    {
        System.out.println("Have formal cloths");
    }
}

class Child extends Parent
{
    int Age = 12;

    String getAge()
    {
        return "The age of Parent is "+super.Age+" And Age of a child is "+Age;
    }
    public Child()
    {
        super();
        System.out.println("This is an child class");
    }

    void Toys()
    {
        System.out.println("Have toys");
    }

    void cloths()
    {
        super.cloths();
        System.out.println("Have fancy cloths");
    }
}
public class Super
{
    public static void main(String[] args) {
        Child c = new Child();
        c.cloths();
        c.Toys();
        System.out.println(c.getAge());

    }
}
