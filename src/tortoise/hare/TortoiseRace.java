package tortoise.hare;

public class TortoiseRace implements  Runnable {
    public void run() {
        Controller.ready++;
        synchronized (Controller.lock) {
            try {
                Controller.lock.wait();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        int RabbitDistance = 0;
        for (int j = 0; RabbitDistance <= 1000; j++) {
            RabbitDistance += 5;
            System.out.println("The tortoise ran 5 meters!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("The tortoise has finished the race!");

    }
}
