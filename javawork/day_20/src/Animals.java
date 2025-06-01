public class Animals extends Thread{
    protected double speed;

    protected static final double Length=20.0;

    protected volatile static double count=0.0;

    public Animals(String name,double speed){
        super(name);
        this.speed=speed;
    }

}
