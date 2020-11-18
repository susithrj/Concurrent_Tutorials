package susithrj.bank;

public class Depositor extends Thread {
    private BankAccount bankAccount;

    public Depositor(BankAccount account) {
        bankAccount = account;
    }


    public void run() {
        for (int i = 0; i < 5; i++)
            bankAccount.deposit(10);

    }
}

