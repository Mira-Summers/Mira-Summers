package factory;

/**
 * 工厂方法模式
 */
public class PhoneFactory02 {
    public Mi getMi(){
        return new Mi();
    }
    public HuaWei getHuaWei(){
        return new HuaWei();
    }
    public Iphone getIphone(){
        return new Iphone();
    }
}
