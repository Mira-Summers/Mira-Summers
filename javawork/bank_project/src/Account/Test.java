package Account;

public class Test {

    public static void main(String[] args) {

        Account account=new Account(10000);


        Thread account1=new Thread(new BankThread(account));
        Thread account2=new Thread(new BankThread(account));

        account1.setName("张三");
        account2.setName("王五");

        account1.start();
        account2.start();

    }


}
