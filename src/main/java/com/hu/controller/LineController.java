package com.hu.controller;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.Line;
import com.hu.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/line")
@Controller
public class LineController {
    @Autowired
    private LineService lineService;

    @RequestMapping("/selectall")
    public String selectAll(@RequestParam(value = "pageNo",
            required = false, defaultValue = "1") Integer pageNum, Model model, Integer id, Line line) {
        if(line != null && id != null){
            if (id == 0) {
                PageInfo<Line> linelist = lineService.searchline(line,8);
                model.addAttribute("lineinfo", linelist);
            } else {
                PageInfo<Line> linelist = lineService.searchlineday(line,8);
                model.addAttribute("lineinfo", linelist);
            }
        }
        else {
            PageInfo<Line> linelist = lineService.getLinePage(pageNum, 8);
            model.addAttribute("lineinfo", linelist);
        }
        return "linelist";
    }

//    @RequestMapping("/selectmore")
//    public String selectmore(@RequestParam(value = "pageNo",
//            required = false, defaultValue = "1") Model model, Integer id, Line line) {
//        if (id == 0) {
//            PageInfo<Line> linelist = lineService.searchline(line,8);
//            model.addAttribute("lineinfo", linelist);
//        } else {
//            PageInfo<Line> linelist = lineService.searchlineday(line,8);
//            model.addAttribute("lineinfo", linelist);
//        }
//        return "linelist";
//    }

    @RequestMapping("/selectLineBylineid/{op}")
    public String selectCompanyBycompho(@PathVariable("op") Integer id, Model model) {
        Line line = lineService.selectLineBylineid(id);
        model.addAttribute("li", line);
        return "updateline";
    }

    @RequestMapping("/upl")
    public String updateline(Line line) {
        lineService.updateline(line);
        return "redirect:/line/selectall";
    }

    @RequestMapping("/deline/{li}")
    public String deleteline(@PathVariable("li") Integer id) {
        lineService.deleteline(id);
        return "redirect:/line/selectall";
    }

    @RequestMapping("/addline")
    public String addline(Line line) {
        lineService.addline(line);
        return "redirect:/line/selectall";
    }
}
