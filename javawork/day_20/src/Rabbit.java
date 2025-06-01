public class Rabbit extends Thread{
    protected double speed;

    public Rabbit(String name,double speed)

    {
        super(name);
        this.speed = speed;
    }
    public void run(){
        for(double i = 0; i<20.00; i+=speed){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i!=0&&i%2==0){
                System.out.println(getName()+"在休息");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(getName()+"跑了"+i);
        }
        System.out.println(getName()+"跑完了");


    }
}
