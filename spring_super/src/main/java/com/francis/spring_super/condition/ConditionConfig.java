package com.francis.spring_super.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
@Configuration
public class ConditionConfig {
    @Conditional(WindowsCondition.class)
    @Bean
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
