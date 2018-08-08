package com.francis.spring_base.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DITest {

    @Autowired
    UseFunctionService useFunctionService;

    @Test
    public void contextLoads() {
        String di = useFunctionService.sayHello("di");
        System.out.println(di);
    }

}

