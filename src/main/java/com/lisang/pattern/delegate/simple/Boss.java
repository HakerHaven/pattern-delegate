package com.lisang.pattern.delegate.simple;

/**
 * Create by lisang on 2019/3/14 14 10:28.
 */
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
