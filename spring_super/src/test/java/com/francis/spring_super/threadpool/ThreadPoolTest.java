package com.francis.spring_super.threadpool;

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
public class ThreadPoolTest {

    @Autowired
    AsyncTaskService taskService;
    @Test
    public void contextLoads() {
        for (int i=0;i<10;i++){
            taskService.executeAsyncTask(i);
        }
    }

}

