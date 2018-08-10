package com.francis.spring_common.prepost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PrepostTest {

    @Autowired
    BeanWayService beanWayService;

    @Autowired
    JSRWayService jsrWayService;

    @Test
    public void contextLoads() {
    }

}
