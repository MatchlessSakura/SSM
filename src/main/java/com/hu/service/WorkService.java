package com.hu.service;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.*;
import com.hu.util.WorkEchart;

import java.util.List;

public interface WorkService {
    List<Work> selectALL();

    List<Work> selectworkline();

    void addwork(CusandLine cusandLine);

    void addcus(CusandLine cusandLine);

    void checkadd(CusandLine cusandLine);

    void deletework(Integer id);

    CusandLine checkname(CusandLine cusandLine);

    Work selectworkbyid(Integer id);

    void updatework(CusandLine cusandLine);

    PageInfo<Work> getWorkPage(Integer pageNum, Integer pageSize);

    PageInfo<Work> searchworkday(Work work, Integer pageSize);

    PageInfo<Work> searchwstatus(Work work, Integer pageSize);

    PageInfo<Work> searchpay0(Work work, Integer pageSize);

    PageInfo<Work> searchpay1(Work work, Integer pageSize);

    List<WorkEchart> echart1();

    List<WorkEchart> echart2();

    List<WorkEchart> echart3();

    List<WorkEchart> echart4();

}
