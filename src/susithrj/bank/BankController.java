package susithrj.bank;

public class BankController {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        int workerscount = 4;
        Thread[] workers = new Thread[workerscount];
        for (int i = 0; i < workerscount; i++) {
            if (i % 2 == 0) {
                workers[i] = new Depositor(account);
            } else {
                workers[i] = new Withdrawer(account);
            }
        }
        for (int i = 0; i < workerscount; i++) {
            workers[i].start();
            System.out.println(Thread.currentThread().getName());
        }
        for (int i = 0; i < workerscount; i++) {
            try {
                workers[i].join();
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException ie) {
                System.err.println(ie.getMessage());
            } finally {
                System.out.println("worker" + i + " has died");
            }
        }
        System.out.print("Closing balance = ");
        System.out.println("$" + account.getBalance());
    }
}

class Monitor {
    private int state = 0;

    public synchronized void update(int newState) {
        state = newState;
    }
}

