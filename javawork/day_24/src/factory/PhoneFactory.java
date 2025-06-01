package factory;

/**
 * 普通工厂模式
 *
 */
public class PhoneFactory {
    public Object getPhone(String phoneName) {
        if (phoneName.equals("mi")) {
            return new Mi();
        } else if (phoneName.equals("HuaWei")) {
            return new Iphone();
        } else if (phoneName.equals("Iphone")) {
            return new Iphone();
        }
        return null;
    }
}
