package spring.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.SpringConfig03;
import spring.ioc.account.AccountService.AccountService;
import spring.ioc.account.servlet.AccountServlet;

import java.lang.annotation.Annotation;

public class SpringTest04 {
    public static void main(String[] args) {
        //创建容器对象
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig03.class);

        AccountServlet servlet=applicationContext.getBean("servlet", AccountServlet.class);
        //确保三层调用
        servlet.saveAccount();
    }
}
