package ProduceConsume;

import java.util.ArrayList;

public class FactoryThread extends Thread{

    public FactoryThread(Factory factory) {
        this.factory = factory;
    }

    private Factory factory;

    public static void main(String[] args) {
        //创建仓库对象
        Factory factory=new Factory(new ArrayList());
        //创建线程对象
        FactoryThread thread1=new FactoryThread(factory);
        FactoryThread thread2=new FactoryThread(factory);

        thread1.setName("生产者");
        thread2.setName("消费者");

        thread1.start();
        thread2.start();


    }


    @Override
    public void run() {
       for(int i=1;i<=10;i++){
           this.factory.in();
           this.factory.out();
       }
    }
}
