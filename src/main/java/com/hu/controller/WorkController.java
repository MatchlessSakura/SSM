package com.hu.controller;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.CusandLine;
import com.hu.pojo.Work;
import com.hu.service.WorkService;
import com.hu.util.WorkEchart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("/work")
@Controller
public class WorkController {
    @Autowired
    private WorkService workService;

    @RequestMapping("/selectall")
    public String selectAll(@RequestParam(value = "pageNo",
            required = false, defaultValue = "1") Integer pageNum, Model model, Work work, Integer id) {
        if (work != null&& id!=null) {
            if (id == 0) {
                if (work.getWorkday() != null) {
                    PageInfo<Work> worklist = workService.searchworkday(work, 8);
                    model.addAttribute("workinfo", worklist);
                } else {
                    PageInfo<Work> worklist = workService.getWorkPage(pageNum, 8);
                    model.addAttribute("workinfo", worklist);
                }
            } else if (id == 1) {
                PageInfo<Work> worklist = workService.searchwstatus(work, 8);
                model.addAttribute("workinfo", worklist);
            } else if (id == 2) {
                PageInfo<Work> worklist = workService.searchpay0(work, 8);
                model.addAttribute("workinfo", worklist);
            } else if (id == 3) {
                PageInfo<Work> worklist = workService.searchpay1(work, 8);
                model.addAttribute("workinfo", worklist);
            }
        } else {
            PageInfo<Work> worklist = workService.getWorkPage(pageNum, 8);
            model.addAttribute("workinfo", worklist);
        }
        return "worklist";
    }
    @RequestMapping("/addwork")
    @ResponseBody
    public Boolean addwork(@RequestBody CusandLine cusandLine, HttpSession session) {
        CusandLine ck = workService.checkname(cusandLine);
        if (ck == null) {
            workService.addwork(cusandLine);
            workService.addcus(cusandLine);
            workService.checkadd(cusandLine);
        } else {
            workService.addwork(cusandLine);
            workService.checkadd(cusandLine);
        }
        int result = 1;
        if (result == 1) {
            return true;
        } else {
            return false;
        }

    }

    @RequestMapping("/selectwork")
    public String selectworkline(Model model) {
        List<Work> worklist = workService.selectworkline();
        model.addAttribute("worklist", worklist);
        return "addwork";
    }

    @RequestMapping("/dework/{w}")
    public String deleteline(@PathVariable("w") Integer id) {
        workService.deletework(id);
        return "redirect:/work/selectall";
    }

    @RequestMapping("/selectworkbyid/{w}")
    public String selectworkbyid(@PathVariable("w") Integer id, Model model) {
        Work wK = workService.selectworkbyid(id);
        model.addAttribute("wk", wK);
        List<Work> worklist = workService.selectworkline();
        model.addAttribute("worklist", worklist);
        return "updatework";
    }

    @RequestMapping("/upwork")
    @ResponseBody
    public Boolean updatework(@RequestBody CusandLine cusandLine, Model model) {
        workService.updatework(cusandLine);
        int result = 1;
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }
    @RequestMapping("/echart1")
    public String charts1(Model model){
        List<WorkEchart> workList = workService.echart1();
        model.addAttribute("worklist", workList);
        return "/e-chart/echart1";
    }

    @RequestMapping("/echart2")
    public String charts2(Model model){
        List<WorkEchart> workList = workService.echart2();
        model.addAttribute("worklist", workList);
        return "/e-chart/echart2";
    }

    @RequestMapping("/echart3")
    public String charts3(Model model){
        List<WorkEchart> workList = workService.echart3();
        model.addAttribute("worklist", workList);
        return "/e-chart/echart3";
    }

    @RequestMapping("/echart4")
    public String charts4(Model model){
        List<WorkEchart> workList = workService.echart4();
        model.addAttribute("worklist", workList);
        return "/e-chart/echart4";
    }
}
