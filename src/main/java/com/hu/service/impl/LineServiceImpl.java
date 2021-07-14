package com.hu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hu.dao.LineMapper;
import com.hu.pojo.Line;
import com.hu.pojo.Work;
import com.hu.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineServiceImpl implements LineService {
    @Autowired
    private LineMapper lineMapper;

    @Override
    public List<Line> selectAll() {
        return lineMapper.selectByExample(null);
    }

    @Override
    public Line selectLineBylineid(Integer id) {
        return lineMapper.selectLineBylineid(id);
    }

    @Override
    public void updateline(Line line) {
        lineMapper.updateline(line);
    }

    @Override
    public void deleteline(Integer id) {
        lineMapper.deleteline(id);
    }

    @Override
    public void addline(Line line) {
        lineMapper.addline(line);
    }

    @Override
    public PageInfo<Line> getLinePage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Line> line = lineMapper.selectByExample(null);
        PageInfo<Line> linePageInfo = new PageInfo<>(line);
        return linePageInfo;
    }

    @Override
    public PageInfo<Line> searchline(Line line, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Line> lines = lineMapper.searchline(line);
        PageInfo<Line> linePageInfo = new PageInfo<>(lines);
        return linePageInfo;
    }

    @Override
    public PageInfo<Line> searchlineday(Line line, Integer pageSize) {
        PageHelper.startPage(1, pageSize);
        List<Line> lines = lineMapper.searchlineday(line);
        PageInfo<Line> linePageInfo = new PageInfo<>(lines);
        return linePageInfo;
    }


}
