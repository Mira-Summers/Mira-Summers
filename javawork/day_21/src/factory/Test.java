package factory;

import java.util.LinkedList;

public class Test {
    House house=new House(new LinkedList<>());

    Sell sell1=new Sell("甲销售员",house);
    Sell sell2=new Sell("乙销售员",house);

    Factory factory=new Factory(house,"工厂");

    factory.

}
