package Account;

public class Account {

    private double Balance;

    public Account(double balance){this.Balance=balance;}
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public void getMoney(double money){

        synchronized (this){

            this.setBalance(this.getBalance()-money);

            System.out.println(Thread.currentThread().getName()+"取走了"+money+"，此时账户内还剩"+Balance);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
