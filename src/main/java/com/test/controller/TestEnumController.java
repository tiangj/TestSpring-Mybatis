package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/18.
 */
@Controller
@RequestMapping("/testEnum")
public class TestEnumController {

    @RequestMapping("/getList")
    @ResponseBody
    public List<Map<String,Object>> getList(){
        Map<String,Object> map=new HashMap<String,Object>();
        return null;
    }
}
