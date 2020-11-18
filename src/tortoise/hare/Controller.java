package tortoise.hare;

public class Controller {

    public static void main(String[] args) {
        TortoiseRace a = new TortoiseRace();
        Thread runner1 = new Thread(a);
        RabbitRace b = new RabbitRace();
        Thread runner2 = new Thread(b);
        runner1.start();
        runner2.start();
        while (ready < 2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    static Object lock = new Object();
    static int ready = 0;
}

