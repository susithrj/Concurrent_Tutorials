package susithrj.bank;

public class Withdrawer extends  Thread{
    private BankAccount account;
    public Withdrawer(BankAccount acct) {
        account = acct; }
    public void run() {
        for(int i = 0; i < 5; i++) {

                account.withdraw(10);

        }
    }
}
