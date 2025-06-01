package test;

import beans.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest01 {
    public static void main(String[] args) {
        //创建核心容器对象
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("/xml/bean.xml");
        //通过组件的唯一标识来取出实例
        Student student=classPathXmlApplicationContext.getBean("student",Student.class);
        System.out.println(student);
    }
}
