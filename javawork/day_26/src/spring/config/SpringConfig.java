package spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.pojo.Teacher;

import java.util.Date;

@Configuration

public class SpringConfig {
   @Bean("teacher")
    public Teacher getTeacher(@Qualifier("date1")Date date){

       Teacher teacher=new Teacher();

       teacher.setId(1001);
       teacher.setName("Jack");
       teacher.setDate(date);
       return teacher;
   }
    @Bean("date1")
    public Date getDate1(){
       return new Date();
    }
    @Bean("date2")
    public Date getDate2(){
       return new Date();
    }
}


