package com.francis.spring_super.condition;

/**
 * @author hzzhugequn
 * @date 2018/8/24
 * @since JDK 1.8
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
