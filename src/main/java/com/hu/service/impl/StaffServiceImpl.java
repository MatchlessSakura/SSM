package com.hu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hu.dao.StaffMapper;
import com.hu.pojo.Staff;
import com.hu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffMapper staffMapper;

    @Override
    public List<Staff> selectAll() {
        return staffMapper.selectByExample(null);
    }

    @Override
    public void insert(Staff staff) {
        staffMapper.insert(staff);
    }

    @Override
    public PageInfo<Staff> getStaffPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Staff> staff = staffMapper.selectByExample(null);
        PageInfo<Staff> staffPageInfo = new PageInfo<>(staff);
        return staffPageInfo;

    }

    @Override
    public void deleteStaff(Integer id) {

        staffMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Staff selectStaffById(Integer id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updatestaff(Staff staff) {
        staffMapper.updateByPrimaryKey(staff);
    }

    @Override
    public PageInfo<Staff> getStaffPage(Integer pageNum, Integer pageSize, String mes) {
        PageHelper.startPage(pageNum, pageSize);
        List<Staff> staff = staffMapper.selectdata(mes);
        PageInfo<Staff> staffPageInfo = new PageInfo<>(staff);
        return staffPageInfo;
    }

}
