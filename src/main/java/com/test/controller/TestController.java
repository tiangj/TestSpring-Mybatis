package com.test.controller;

import com.test.service.ITestService;
import com.test.service.IUserService;
import com.test.util.BaseConditionVO;
import com.test.util.FileUploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tianguojun on 2016/10/14.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    //request对象
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ITestService testService;

    @Autowired
    private IUserService userService;

    /**
     * aop测试
     *
     * @return
     */
    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(BaseConditionVO vo,Model model) {
        vo.setTotalCount(100);
//
        model.addAttribute("vo", vo);
        return "hello";
    }

    /**
     * 测试spring-mybatis
     *
     * @return
     */
    @RequestMapping("/getList")
    @ResponseBody
    public List<Map<String, Object>> getList() {
        System.out.print(request.getContextPath());
        Map<String, Object> map = new HashMap<String, Object>();
        return userService.getList(map);
    }

    /**
     * 一般上传文件的方法(使用apache上传组件),使用时需注释掉spring-mvc.xml 文件中的相关文件配置
     *
     * @return
     */
    @RequestMapping("/uploadFile")
    @ResponseBody
    public Integer uploadFile() throws IOException {
        System.out.print("文件流:" + request.getInputStream());
//        request.
        //调用上传的帮助类
        Integer result = FileUploadUtil.saveFile(request);
        return result;
    }
}
