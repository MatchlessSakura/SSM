package com.hu.service;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.User;

import java.util.List;

public interface UserService {
    //查询所有
    List<User> selectAll();
    //插入
    void insert(User user);
    //分页
    PageInfo<User> getUserPage(Integer pageNum,Integer pageSize);

    User selectUserById(Integer id);

    void updateuser(User user);

    void deleteuser(Integer id);

    User checklog(User user);
}
