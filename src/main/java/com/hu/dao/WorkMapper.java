package com.hu.dao;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.CusandLine;
import com.hu.pojo.Work;
import com.hu.pojo.WorkExample;

import java.util.List;

import com.hu.util.WorkEchart;
import org.apache.ibatis.annotations.Param;

public interface WorkMapper {
    long countByExample(WorkExample example);

    int deleteByExample(WorkExample example);

    int deleteByPrimaryKey(Integer workid);

    int insert(Work record);

    int insertSelective(Work record);

    List<Work> selectByExample(WorkExample example);

    Work selectByPrimaryKey(Integer workid);

    int updateByExampleSelective(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByExample(@Param("record") Work record, @Param("example") WorkExample example);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    List<Work> selectALL(Integer id);

    void addwork(CusandLine cusandLine);

    List<Work> selectworkline(Integer id);

    void addcus(CusandLine cusandLine);

    void checkadd(CusandLine cusandLine);

    void deletework(Integer id);

    CusandLine checkname(CusandLine cusandLine);

    Work selectworkbyid(Integer id);

    void updateline(CusandLine cusandLine);

    void updatework(CusandLine cusandLine);

    List<Work> searchworkday(Work work);

    List<Work> searchwstatus(Work work);

    List<Work> searchpay0(Work work);

    List<Work> searchpay1(Work work);

    List<WorkEchart> echart1();

    List<WorkEchart> echart2();

    List<WorkEchart> echart3();

    List<WorkEchart> echart4();
}