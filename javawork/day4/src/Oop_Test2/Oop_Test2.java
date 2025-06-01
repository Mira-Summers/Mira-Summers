package Oop_Test2;

public class Oop_Test2 {
    public static void main(String[] args) {
        System.out.println("输出主函数");
        getMethod();
    }
    public static void getMethod(){
        System.out.println("这是一个静态方法");
    }
    static{
        System.out.println("输出静态代码块");
    }
}
