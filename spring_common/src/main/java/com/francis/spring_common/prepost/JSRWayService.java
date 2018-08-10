package com.francis.spring_common.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
public class JSRWayService {
    @PostConstruct
    public void init(){
        System.out.println("JSR-init-method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("@JSR-destroy-method");
    }

    public JSRWayService() {
        System.out.println("JSR-构造函数");
    }
}
