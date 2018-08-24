package com.francis.spring_super.threadpool;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i){
        System.out.println("执行异步任务： "+i);
    }
}
