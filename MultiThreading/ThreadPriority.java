package MultiThreading;

class thread1 extends Thread
{
    public void run()
    {
        System.out.println("This is a first thread  ");
    }
}

class thread2 extends Thread
{
    public void run()
    {
        System.out.println("This is a second thread");
    }
}

public class ThreadPriority
{
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.setPriority(1);    //It is similar to Thread.MIN_PRIORITY
        t2.setPriority(10);  //It is similar to Thread.MAX_PRIORITY

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }
}
