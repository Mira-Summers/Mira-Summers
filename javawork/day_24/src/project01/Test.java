package project01;

public class Test {
    public static void main(String[] args) {
        //创建一个目标对象
        A a=new A();

        //创建代理对象
       A proxy=(A)new CreateProxy(a).getProxy();


       //创建消费者对象
        //
    }
}
