package Proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CreateProxy {
    public CreateProxy(Object object) {
        this.object = object;
    }

    private Object object;//创建对象接收

    public Object getProxy(){

        return Proxy.newProxyInstance(this.object.getClass().getClassLoader(), this.object.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开启事务");
                System.out.println("开启日志回收");
                Object invoke=method.invoke(object,args);
                System.out.println("关闭事务");
                return invoke;
            }
        });
    }
    }


