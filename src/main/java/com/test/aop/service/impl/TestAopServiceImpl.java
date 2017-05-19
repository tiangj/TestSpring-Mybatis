package com.test.aop.service.impl;

import com.test.aop.service.ITestAopServcie;
import com.test.bean.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by admin on 2017/5/5.
 */
public class TestAopServiceImpl implements ITestAopServcie {

    @Autowired
    private UserMapper userMapper;

    public String sysInfo() {
        System.out.println("sysInfo...");
        return null;
    }

    public String afterInfo() {
        System.out.println("afterInfo...");
        return null;
    }
}
