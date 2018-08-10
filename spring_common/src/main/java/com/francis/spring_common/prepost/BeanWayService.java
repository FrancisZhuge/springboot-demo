package com.francis.spring_common.prepost;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
public class BeanWayService {
    public void init(){
        System.out.println("@Bean-init-method");
    }
    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

    public BeanWayService() {
        System.out.println("@Bean-构造函数");
    }
}
