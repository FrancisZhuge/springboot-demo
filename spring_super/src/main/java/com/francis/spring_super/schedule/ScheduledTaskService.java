package com.francis.spring_super.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportTime(){
        System.out.println("每隔五秒执行一次： "+sdf.format(new Date()));
    }
}
