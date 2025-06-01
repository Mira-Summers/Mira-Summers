package Account;

public class BankThread implements java.lang.Runnable {
    public BankThread(Account account) {
        this.account = account;
    }

    private Account account;
    @Override
    public void run() {
        account.getMoney(5000);

    }
}
