package spring.Proxy;

import org.springframework.beans.factory.annotation.Autowired;
import spring.service.TestService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class AopProxy implements InvocationHandler {
    @Autowired
    private TestService testService;

    public Object getProxy(){
        return Proxy.newProxyInstance(testService.getClass().getClassLoader(), testService.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        if (method.getName().equals("test")) {
            invoke = method.invoke(testService, args);
        }


        return invoke;
    }
}

