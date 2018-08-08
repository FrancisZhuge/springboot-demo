package com.francis.spring_common.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScopeTest {

    @Autowired
    AnnotationConfigApplicationContext context;
    @Test
    public void contextLoads() {
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

        System.out.println("s1与s2是否相等： "+ s1.equals(s2));
        System.out.println("p1与p2是否相等： "+ p1.equals(p2));
    }

}