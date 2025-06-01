import java.text.DecimalFormat;

public class Rooster extends Animals{
    protected double speed;

    public Rabbit getRabbit() {
        return rabbit;
    }

    public void setRabbit(Rabbit rabbit) {
        this.rabbit = rabbit;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    private Rabbit rabbit;
    private Turtle turtle;

    private Integer time=0;


    public Rooster(String name,double speed){
        super(name,speed);
    }

    @Override
    public void run() {
        for (double i=0;i<=getStackTrace().length;i+=speed){
            System.out.println(getName()+"跑了"+i);
            try {
                sleep(500);
                time++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName()+"跑了"+(new DecimalFormat("#.##").format(i+speed)+"米"));
            System.out.println("一共跑了"+(new DecimalFormat("#.##").format(i+speed)+"米"));
            if(time%3==0){
                System.out.println(getName()+"在吃虫子");
                try {
                    sleep(600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(getName()+"跑完了");
        if(this.rabbit.isAlive()){
            this.rabbit.stop();
        }
        if(this.turtle.isAlive()){
            this.turtle.stop();
        }

    }
}
