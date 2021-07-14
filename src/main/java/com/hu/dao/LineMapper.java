package com.hu.dao;

import com.hu.pojo.Line;
import com.hu.pojo.LineExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface LineMapper {
    long countByExample(LineExample example);

    int deleteByExample(LineExample example);

    int deleteByPrimaryKey(Integer lineid);

    int insert(Line record);

    int insertSelective(Line record);

    List<Line> selectByExample(LineExample example);

    Line selectByPrimaryKey(Integer lineid);

    int updateByExampleSelective(@Param("record") Line record, @Param("example") LineExample example);

    int updateByExample(@Param("record") Line record, @Param("example") LineExample example);

    int updateByPrimaryKeySelective(Line record);

    int updateByPrimaryKey(Line record);

    Line selectLineBylineid(Integer id);

    void updateline(Line line);

    void deleteline(Integer id);

    void addline(Line line);

    List<Line> searchline(Line line);

    List<Line> searchlineday(Line line);
}