package com.hu.service;

import com.hu.pojo.Company;

import java.util.List;

public interface CompanyService {
    List<Company> selectAll();
    Company selectCompanyBycomid(Integer id);
    void updatecp(Company company);
}
