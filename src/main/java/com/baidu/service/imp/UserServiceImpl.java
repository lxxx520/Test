package com.baidu.service.imp;

import com.baidu.mapper.UserMapper;
import com.baidu.pojo.User;
import com.baidu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    // 新增登记
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    //查询全部
    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }

    //查询一共多少人
    @Override
    public int countOne( ) {
        return userMapper.countOne();
    }

    //查询性别
    @Override
    public int selctBySex() {
        return userMapper.selctBySex();
    }
}
