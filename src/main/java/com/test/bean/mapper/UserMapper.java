package com.test.bean.mapper;


import com.test.bean.User;

import java.util.List;
import java.util.Map;

public interface UserMapper{
    int insert(User record);

    int insertSelective(User record);

    List<Map<String,Object>> getList(Map<String,Object> map);

    Map<String,Object> getInfoById(String id);
}