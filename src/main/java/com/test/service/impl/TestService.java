package com.test.service.impl;

import com.test.service.ITestService;
import org.springframework.stereotype.Service;

/**
 * Created by tianguojun on 2016/10/14.
 */
@Service("testService")
public class TestService implements ITestService {

    public String hello() {
        return "hello";
    }
}
