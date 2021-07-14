package com.hu.controller;

import com.hu.pojo.Company;
import com.hu.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@RequestMapping("/company")
@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping("/selectall")
    public String selectAll(Model model) {
        List<Company> companyList = companyService.selectAll();
        model.addAttribute("companylist", companyList);
        return "companylist";
    }
    @RequestMapping("/selectCompanyBycomid/{op}")
    public String selectCompanyBycomid(@PathVariable("op") Integer id,Model model){
        Company company=companyService.selectCompanyBycomid(id);
        model.addAttribute("cp",company);
        return "companylist";
    }
    @RequestMapping("/upcp")
    public String updatecp(Company company){
        companyService.updatecp(company);
        return "redirect:/company/selectall";
    }
}
