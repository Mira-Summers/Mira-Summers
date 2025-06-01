package Proxy;

public class ProxyApp {
    public static void main(String[] args) {
        MyClassProxy myClassProxy=new MyClassProxy(new MyClassProxy02());
        myClassProxy.findHouse();
    }
}
