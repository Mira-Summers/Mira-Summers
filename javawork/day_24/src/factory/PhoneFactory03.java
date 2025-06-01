package factory;

public class PhoneFactory03 implements Factory{


    @Override
    public Phone tack(String className) {
        Class aClass = null;
        try {
            //获得类的class对象
            aClass = Class.forName(className);
            //选择addcatch,创建实例
            Object instance = aClass.newInstance();
            if (instance instanceof Phone) {
                Phone phone = (Phone) instance;
                return phone;
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
