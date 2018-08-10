package com.francis.spring_common.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author hzzhugequn
 * @date 2018/8/10
 * @since JDK 1.8
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
