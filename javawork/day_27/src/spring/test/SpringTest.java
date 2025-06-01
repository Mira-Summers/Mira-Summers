package spring.test;

import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.Proxy.AopProxy;
import spring.pojo.Person;
import spring.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/xml/beans.xml")
public class SpringTest {
    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    Person person;

    AopProxy aopProxy;

    public void test01(){
        //创建代理对象
        TestService testService =(TestService) aopProxy.getProxy();
                //核心方法收集日志，非核心方法不收集日志
    }



}
