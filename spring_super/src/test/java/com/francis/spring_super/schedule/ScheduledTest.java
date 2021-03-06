package com.francis.spring_super.schedule;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScheduledTest {
    @Autowired
    private ScheduledTaskService taskService;

    @Test
    public void contextLoads() {
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
