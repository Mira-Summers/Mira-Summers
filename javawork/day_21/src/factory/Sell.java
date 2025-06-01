package factory;
//创建销售员线程
public class Sell extends Thread {
    private House house;
    private String name;

    public Sell(String name,House house ) {
        super(name);
        this.house = house;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500*3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.house.out();
        this.house.out();
    }
}
