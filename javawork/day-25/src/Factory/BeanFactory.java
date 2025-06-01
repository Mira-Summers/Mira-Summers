package Factory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    public static Map<String,Object> beanMap;

    static {
        //创建集合对象
        beanMap=new HashMap<>();
        FileReader fileReader=null;

        try{
            // 创建流对象
            try {
                fileReader=new FileReader("beans.properties");
                //创建集合对象
                Properties properties=new Properties();
                //结合流对象
                properties.load(fileReader);
                Enumeration enumeration=properties.propertyNames();
                while (enumeration.hasMoreElements()){
                    String key=(String) enumeration.nextElement();
                    //根据key获取value
                    String value=properties.getProperty(key);
                    //通过反射将实例创建出来
                    Class aclass=Class.forName(value);
                    //创建实例
                    Object newInstance=aclass.newInstance();
                    //将实例添加到集合中
                    beanMap.put(key,newInstance);

                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }


        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static Object getBean(String id){return beanMap.get(id);}
}
