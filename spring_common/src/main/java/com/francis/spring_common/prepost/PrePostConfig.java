package com.francis.spring_common.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
@Configuration
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }

    @Bean
    JSRWayService jsrWayService(){
        return new JSRWayService();
    }
}
