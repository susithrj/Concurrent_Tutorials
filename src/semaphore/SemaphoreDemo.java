package semaphore;



import java.util.concurrent.Semaphore;

// Driver class
public class SemaphoreDemo
{
    public static void main(String args[]) throws InterruptedException
    {
        // creating a Semaphore object
        // with number of permits 1
        Semaphore sem = new Semaphore(1);

        // creating two threads with name A and B
        // Note that thread A will increment the count
        // and thread B will decrement the count
        semaphore.MyThread mt1 = new semaphore.MyThread(sem, "A");
        semaphore.MyThread mt2 = new semaphore.MyThread(sem, "B");

        // stating threads A and B
        mt1.start();
        mt2.start();

        // waiting for threads A and B
        mt1.join();
        mt2.join();

        // count will always remain 0 after
        // both threads will complete their execution
        System.out.println("count: " + Shared.count);
    }
}

class Shared
{
    static int count = 0;
}
