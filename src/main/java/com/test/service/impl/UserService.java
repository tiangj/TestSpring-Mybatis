package com.test.service.impl;

import com.test.bean.User;
import com.test.bean.mapper.UserMapper;
import com.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/5/10.
 */
@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public Integer saveUserInfo(User user) {
        return null;
    }

    public List<Map<String,Object>> getList(Map<String,Object> map){
       return userMapper.getList(map);
    }
}
