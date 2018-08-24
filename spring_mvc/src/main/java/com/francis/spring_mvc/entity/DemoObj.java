package com.francis.spring_mvc.entity;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
public class DemoObj {
    private long id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DemoObj{" +
                       "id=" + id +
                       ", name='" + name + '\'' +
                       '}';
    }
}
