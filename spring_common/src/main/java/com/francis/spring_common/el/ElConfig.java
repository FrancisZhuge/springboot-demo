package com.francis.spring_common.el;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
@Configuration
@PropertySource("classpath:com/francis/spring_common/el/test.properties")
public class ElConfig {

    @Value("I Like You!")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(bookName);
    }

}
