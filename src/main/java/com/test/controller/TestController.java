package com.test.controller;

import com.test.service.ITestService;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tianguojun on 2016/10/14.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ITestService testService;

    @Autowired
    private IUserService userService;

    /**
     * aop测试
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return testService.hello();
    }

    /**
     * 测试spring-mybatis(info测试)
     * @return
     */
    @RequestMapping("/getList")
    @ResponseBody
    public List<Map<String,Object>> getList(){
        Map<String,Object> map=new HashMap<String,Object>();
        return userService.getList(map);
    }
}
