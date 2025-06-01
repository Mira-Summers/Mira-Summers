package Runnable;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable runnable=new Runnable();

        Thread thread=new Thread(runnable);
        thread.start();
    }
}
