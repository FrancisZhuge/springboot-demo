package com.francis.spring_base.javaconfig;

/**
 * @author hzzhugequn
 * @date 2018/8/8
 * @since JDK 1.8
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
