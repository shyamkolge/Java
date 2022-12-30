package MultiThreading;

class Thread1 implements Runnable
{
    public void run()
    {
        System.out.println("This is a First Thread");
    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        System.out.println("This is a second thread");
    }
}


public class RunnableInterface
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread t = new Thread(t1);

        Thread2 t3 = new Thread2();
        Thread t2 = new Thread(t3);

        t.start();
        t2.start();

    }
}
