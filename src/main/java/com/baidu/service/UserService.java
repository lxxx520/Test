package com.baidu.service;

import com.baidu.pojo.User;

import java.util.List;

public interface UserService {
    //新增登记
    int insert(User user);

    // 查询全部
    List<User> selectList();

   //查询一共多少人
    int countOne();

    //查询性别
    int selctBySex();
}
