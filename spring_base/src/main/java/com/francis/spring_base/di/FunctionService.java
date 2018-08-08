package com.francis.spring_base.di;

import org.springframework.stereotype.Service;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+word+" !";
    }
}
