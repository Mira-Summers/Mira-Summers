package beans;

public class Person {
    public Person(){
        System.out.println("创建");
    }

    public void init(){
        System.out.println("初始化");
    }
    public void destory(){
        System.out.println("销毁");
    }
}
