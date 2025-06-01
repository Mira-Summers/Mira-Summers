package factory;
//创建工厂线程
public class Factory extends Thread{
    public Sell getSell1() {
        return sell1;
    }

    public void setSell1(Sell sell1) {
        this.sell1 = sell1;
    }

    public Sell getSell2() {
        return sell2;
    }

    public void setSell2(Sell sell2) {
        this.sell2 = sell2;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    private Sell sell1;
    private Sell sell2;

    private House house;

    //有参构造共同对象factory
    public Factory(House house, String name) {
        super(name);
        this.house = house;

    }

    private Factory factory;
    private String name;




    @Override
    public void run() {
        while (true){
            if(!sell1.isAlive()&&!sell2.isAlive()){
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           this.house.in();
        }
    }
}
