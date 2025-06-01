package factory;

public class Test {
    public static void main(String[] args) {
        PhoneFactory03 phoneFactory03=new PhoneFactory03();
        Phone huawei=phoneFactory03.tack("factory.HuaWei");
        System.out.println(huawei);
    }
}
