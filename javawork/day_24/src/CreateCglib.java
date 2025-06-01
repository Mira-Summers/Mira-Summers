import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CreateCglib implements MethodInterceptor {

    public CreateCglib(Object object) {
        this.object = object;
    }

    private Object object;

    public Object getProxy(){
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object invoke=method.invoke(object,objects);

        System.out.println("提交事务");
        return invoke;
    }


}
