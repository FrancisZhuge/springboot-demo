package com.francis.spring_super.aware;

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
public class AwareTest {

    @Autowired
    AwareService awareService;
    @Test
    public void contextLoads() {
        awareService.outputResult();
    }

}
