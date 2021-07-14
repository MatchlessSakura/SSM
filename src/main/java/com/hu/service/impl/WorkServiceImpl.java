package com.hu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hu.dao.WorkMapper;
import com.hu.pojo.*;
import com.hu.service.WorkService;
import com.hu.util.WorkEchart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    private WorkMapper workMapper;

    @Override
    public List<Work> selectALL() {
        return workMapper.selectALL(null);
    }

    @Override
    public List<Work> selectworkline() {
        return workMapper.selectworkline(null);
    }

    @Override
    public void addwork(CusandLine cusandLine) {
        workMapper.addwork(cusandLine);
    }

    @Override
    public void addcus(CusandLine cusandLine) {
        workMapper.addcus(cusandLine);
    }

    @Override
    public void checkadd(CusandLine cusandLine) {
        workMapper.checkadd(cusandLine);
    }

    @Override
    public void deletework(Integer id) {
        workMapper.deletework(id);
    }

    @Override
    public CusandLine checkname(CusandLine cusandLine) {
        return workMapper.checkname(cusandLine);
    }

    @Override
    public Work selectworkbyid(Integer id) {
        return workMapper.selectworkbyid(id);
    }

    @Override
    public void updatework(CusandLine cusandLine) {
        workMapper.updatework(cusandLine);
    }

    @Override
    public PageInfo<Work> getWorkPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Work> work = workMapper.selectALL(null);
        PageInfo<Work> workPageInfo = new PageInfo<>(work);
        return workPageInfo;
    }

    @Override
    public PageInfo<Work> searchworkday(Work work, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Work> works = workMapper.searchworkday(work);
        PageInfo<Work> workPageInfo = new PageInfo<>(works);
        return workPageInfo;
    }

    @Override
    public PageInfo<Work> searchwstatus(Work work, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Work> works = workMapper.searchwstatus(work);
        PageInfo<Work> workPageInfo = new PageInfo<>(works);
        return workPageInfo;
    }

    @Override
    public PageInfo<Work> searchpay0(Work work, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Work> works = workMapper.searchpay0(work);
        PageInfo<Work> workPageInfo = new PageInfo<>(works);
        return workPageInfo;
    }

    @Override
    public PageInfo<Work> searchpay1(Work work, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Work> works = workMapper.searchpay1(work);
        PageInfo<Work> workPageInfo = new PageInfo<>(works);
        return workPageInfo;
    }

    @Override
    public List<WorkEchart> echart1() {
        return workMapper.echart1();
    }

    @Override
    public List<WorkEchart> echart2() {
        return workMapper.echart2();
    }

    @Override
    public List<WorkEchart> echart3() {
        return workMapper.echart3();
    }

    @Override
    public List<WorkEchart> echart4() {
        return workMapper.echart4();
    }

}
