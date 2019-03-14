package com.lisang.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by lisang on 2019/3/14 14 10:25.
 */
public class Leader implements IEmployee {
    private Map<String,IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader() {
        targets.put("加密",new IEmployeeA());
        targets.put("登录",new IEmployeeB());
    }

    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
