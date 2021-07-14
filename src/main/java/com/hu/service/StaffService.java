package com.hu.service;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.Staff;
import com.hu.pojo.User;

import java.util.List;

public interface StaffService {
    List<Staff> selectAll();

    //新增
    void insert(Staff staff);

    PageInfo<Staff> getStaffPage(Integer pageNum, Integer pageSize);

    //删除
    void deleteStaff(Integer id);

    //根据商品编号查询商品信息
    Staff selectStaffById(Integer id);

    //更新
    void updatestaff(Staff staff);

    PageInfo<Staff> getStaffPage(Integer pageNum, Integer pageSize, String mes);
}


