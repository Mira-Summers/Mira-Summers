package Proxy2;

public class MyClassProxy implements MyInterface {
    @Override
    public void method1() {
        System.out.println("核心业务1");
    }

    @Override
    public void method2() {
        System.out.println("核心业务2");
    }

    @Override
    public void method3() {
        System.out.println("核心业务3");
    }

    @Override
    public String test(String data) {
        return data;
    }
}
