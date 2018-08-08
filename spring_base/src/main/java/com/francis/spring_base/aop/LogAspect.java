package com.francis.spring_base.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("bean(*Service)")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }
    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }
}
