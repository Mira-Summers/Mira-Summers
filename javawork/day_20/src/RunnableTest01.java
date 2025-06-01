public class RunnableTest01 {
    public static void main(String[] args) {
        Thread thread01=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread=Thread.currentThread();
                for(int i=1;i<=20;i++){
                    System.out.println(thread.getName()+"-----"+i);
                    if (i == 5) {
                        thread.suspend();
                        thread.resume();
                    } else {
                        System.out.println(thread.getName()+"------"+i);
                        System.out.println("判断："+thread.isAlive());
                    }
                }
            }
        });
        thread01.start();
    }
}
