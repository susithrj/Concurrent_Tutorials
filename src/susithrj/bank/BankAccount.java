package susithrj.bank;

public class BankAccount {
    private double balance= 100;

    public BankAccount(double bal) {
        balance = bal;
    }

    public BankAccount() {
        this(0);
    }

    public synchronized double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amt) {

        double temp = balance;
        temp = temp + amt;
        try {
            Thread.sleep(300); // simulate production time
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
        System.out.println("after deposit balance = $" + temp);
        balance = temp;
        notify();

    }

    public synchronized void withdraw(double amt) {
        while (balance < amt) {
            try {
                wait(); // wait for funds
            } catch (InterruptedException ie) {
                System.err.println(ie.getMessage());
            }
        }

        double temp = balance;
        temp = temp - amt;
        try {
            Thread.sleep(300); // simulate production time
        } catch (InterruptedException ie) {
            System.err.println(ie.getMessage());
        }
        System.out.println("after withdraw balance = $" + temp);
        balance = temp;

    }
}
