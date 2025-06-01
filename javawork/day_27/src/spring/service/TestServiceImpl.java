package spring.service;

public class TestServiceImpl implements TestService{
    @Override
    public void method1() {
        System.out.println("核心方法1：");
    }

    @Override
    public void method2() {
        System.out.println("核心方法2：");
    }

    @Override
    public void method3() {
        System.out.println("核心方法3：");
    }

    @Override
    public void method4() {
        System.out.println("核心方法4：");
        int i=1/0;
    }

    @Override
    public void method5() {
        System.out.println("核心方法5");
    }

    @Override
    public void test() {
        System.out.println("非核心方法：");
    }
}
