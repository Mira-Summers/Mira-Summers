package Proxy;

public class MyClassProxy implements MyInterface{
    MyInterface myInterface;
    public MyClassProxy(MyInterface myInterface){this.myInterface=myInterface;}

    @Override
    public void findHouse() {
        System.out.println("1.看房");
        myInterface.findHouse();
        myInterface.findHouse();
        myInterface.findHouse();
        System.out.println("2.收取中介费");
        System.out.println("3.签合同");
    }
}
