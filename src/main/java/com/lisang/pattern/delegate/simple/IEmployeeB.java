package com.lisang.pattern.delegate.simple;

/**
 * Create by lisang on 2019/3/14 14 10:23.
 */
public class IEmployeeB implements IEmployee {
    public void doing(String command) {
        System.out.println("职员B，正在做"+command+"工作");
    }
}
