package com.hu.controller;

import com.github.pagehelper.PageInfo;
import com.hu.pojo.Staff;
import com.hu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/selectall")
    public String selectAll(@RequestParam(value = "pageNo",
            required = false, defaultValue = "1") Integer pageNum, Model model) {
        PageInfo<Staff> stafflist = staffService.getStaffPage(pageNum, 8);
        model.addAttribute("staffinfo", stafflist);
        return "stafflist";
    }

    @RequestMapping("/addstaff")
    public String insert(Staff staff) {

        //调用业务逻辑层插入方法
        staffService.insert(staff);
        return "redirect:/staff/selectall";
    }

    //po对应jsp里面${staff.staffid}
    @RequestMapping("/deletestaff/{op}")
    public String deleteStaff(@PathVariable("op") Integer id) {
        //调用业务逻辑层删除
        staffService.deleteStaff(id);
        //去查询是否删除
        return "redirect:/staff/selectall";
    }

    //根据商品编号查询商品信息
    @RequestMapping("/selectstaffById/{op}")
    public String selectStaffByStaffid(@PathVariable("op") Integer id, Model model) {
        //调用业务逻辑层，根据商品编号查询商品信息
        Staff staff = staffService.selectStaffById(id);
        //将查询回来的商品信息保存在request作用域中
        model.addAttribute("staff", staff);
        return "staffupdate";

    }

    @RequestMapping("/upstaff")
    public String updatestaff(Staff staff) {

        //调用业务逻辑层插入方法
        staffService.updatestaff(staff);
        return "redirect:/staff/selectall";
    }

    @RequestMapping("/selectdata")
    public String selectdata(@RequestParam(value = "pageNo",
            required = false, defaultValue = "1") Integer pageNum, Model model, String mes) {
        PageInfo<Staff> stafflist = staffService.getStaffPage(pageNum, 8, mes);
        model.addAttribute("staffinfo", stafflist);
        return "stafflist";
    }
}
