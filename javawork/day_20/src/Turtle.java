import java.util.Objects;

public class Turtle extends Thread{


    public Rabbit getRabbit() {
        return rabbit;
    }

    public void setRabbit(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    public Rooster getRooster() {
        return rooster;
    }

    public void setRooster(Rooster rooster) {
        this.rooster = rooster;
    }

    protected Rabbit rabbit;
    protected Rooster rooster;



    public Turtle(String name,double speed) {
        super(name);
        this.speed=speed;


    }


    public void run(){
        for(double i=0;i< getStackTrace().length;i+=speed){
            System.out.println(getName()+"跑了"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println(getName()+"跑完了");
        if(rabbit.isAlive()){
            this.rabbit.stop();
        }
        if(rooster.isAlive()){
            this.rooster.stop();
        }


    }
}
