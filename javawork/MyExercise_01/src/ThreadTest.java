public class ThreadTest implements Runnable {

    @Override
    public void run() {
        Dosome();



    }

    public static void main(String[] args) {

        ThreadTest threadTest=new ThreadTest();
        Thread thread=new Thread(threadTest);
        Thread thread1=new Thread(threadTest);

        thread.setName("t1");
        thread1.setName("t2");

        thread.start();
        thread1.start();
    }
    public synchronized void Dosome(){
        System.out.println("1---------------");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("2---------------");

    }

}
