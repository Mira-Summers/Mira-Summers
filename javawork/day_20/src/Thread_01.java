import java.util.Objects;

public class Thread_01 extends Thread{
    public static void main(String[] args) {
        Thread_01 t1 = new Thread_01();
        Thread_01 t2 = new Thread_01();

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }

    public void run(){
        Thread thread=Thread.currentThread();
        for(int i=1;i<=20;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == 5) {
                thread.suspend();
                System.out.println("判断："+thread.isAlive());
                thread.resume();
                System.out.println("判断："+thread.isAlive());
            } else {
            System.out.println(thread.getName()+"------"+i);
                System.out.println("判断："+thread.isAlive());
        }
    }

}}
