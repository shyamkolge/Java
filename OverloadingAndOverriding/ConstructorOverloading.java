package OverloadingAndOverriding;

class Student
{
    int Roll;
    String name;
    float Marks;

    Student() {}

    Student(int roll,String name)
    {
        this.Roll = roll;
        this.name = name;
    }

    Student(int roll,String name,float Marks)
    {
        this.Roll = roll;
        this.name = name;
        this.Marks = Marks;
    }

    void display()
    {
        System.out.println("Roll is "+Roll+" Name is "+name+" Marks is "+Marks);
    }
}

public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student(1,"Shyam");
        Student s3 = new Student(1,"Shyam",98);

        s1.display();
        s2.display();
        s3.display();

    }
}
