package com.hu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hu.dao.UserMapper;
import com.hu.pojo.User;
import com.hu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public PageInfo<User> getUserPage(Integer pageNum, Integer pageSize) {

        //必须写在第一句
        PageHelper.startPage(pageNum, pageSize);
        //完成pageNum这一页的pagesize条数据
        List<User> user = userMapper.selectByExample(null);
        //封装PageInfo对象
        PageInfo<User> userPageInfo = new PageInfo<>(user);
        return userPageInfo;
    }

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateuser(User user) {
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteuser(Integer id) {
        userMapper.deleteByPrimaryKey(id);

    }
    @Override
    public User checklog(User user) {
        return userMapper.checklog(user);
    }

}
