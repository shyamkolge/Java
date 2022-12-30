package StaticKeyWord;

public class StaticKeyWord
{
    //Static DataField
    static String CollegeName="GPM";

    //Static Method
    public static void addTwoNumbers(int num, int num2)
    {
        System.out.println("The addition of two numbers is "+(num+num2));
    }

    //Static block
    static
    {
        System.out.println("It is a static block");  //It will execute before the Main method.
    }

    //Only a inner class can be a static
    static class Demo
    {
        void show()
        {
            System.out.println("This is an Static method");
        }
    }

    public static void main(String[] args)
    {
        addTwoNumbers(4,5); //we can call it without creating it's object
        System.out.println("College name is " +StaticKeyWord.CollegeName);

        StaticKeyWord.Demo obj = new StaticKeyWord.Demo();  //Here there is no need to create object of OuterClass
        obj.show();

    }
}
