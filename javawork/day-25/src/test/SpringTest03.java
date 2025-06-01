package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest03 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beanFactory=new  ClassPathXmlApplicationContext("/xml/beans.xml") ;

        Object person1=beanFactory.getBean("person");
        Object person2=beanFactory.getBean("person");

        System.out.println(person1==person2);

        beanFactory.close();
    }
}
