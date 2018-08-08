package com.francis.spring_base.aop;

import org.springframework.stereotype.Service;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("add method");
    }
}
