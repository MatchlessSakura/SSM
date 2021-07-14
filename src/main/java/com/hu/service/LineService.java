package com.hu.service;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.Line;

import java.util.List;

public interface LineService {
    List<Line> selectAll();

    Line selectLineBylineid(Integer id);

    void updateline(Line line);

    void deleteline(Integer id);

    void addline(Line line);

    PageInfo<Line> getLinePage(Integer pageNum, Integer pageSize);

    PageInfo<Line> searchline(Line line, Integer pageSize);

    PageInfo<Line> searchlineday(Line line, Integer pageSize);
}
