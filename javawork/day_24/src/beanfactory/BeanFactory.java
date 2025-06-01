package beanfactory;


import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private static Map<String, Object> beanMap;

    static {
        //创建实例
        beanMap=new HashMap<>();
    }

    /**
     * 根据唯一标识获得实例的方法
     * @param id
     * @return
     */
    public static Object getBean(String id){

        return beanMap.get(id);
    }

}
