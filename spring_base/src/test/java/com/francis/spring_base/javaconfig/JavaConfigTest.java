package com.francis.spring_base.javaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**JavaConfigTest
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaConfigTest {

    @Autowired
    UseFunctionService useFunctionService;

    @Test
    public void contextLoads() {
        String di = useFunctionService.sayHello("java config");
        System.out.println(di);
    }

}