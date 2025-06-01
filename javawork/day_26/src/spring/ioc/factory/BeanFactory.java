package spring.ioc.factory;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {
    private static Map<String,Object> beanMap;

    static {beanMap=new HashMap<>();
    }
}
