package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import spring.service.TestService;

public class SpringTest02 {
    @Autowired
    TestService testService;

    public void test03(){
        testService.test();

    }

}
