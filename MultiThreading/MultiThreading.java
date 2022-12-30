package MultiThreading;

class th1 extends Thread
{
    public void run()
    {
        for(int i = 0 ; i<10; i++)
        {
            System.out.println("I = "+ i);
        }
    }
}

class th2 extends Thread
{
    public void run()
    {
        for(int i = 0 ; i<5; i++)
        {
            System.out.println("I = "+ i);
        }
    }
}


public class MultiThreading
{
    public static void main(String[] args) {
        th1 t1 = new th1();
        th2 t2 = new th2();

        t1.start();
        t2.start();
    }

}
