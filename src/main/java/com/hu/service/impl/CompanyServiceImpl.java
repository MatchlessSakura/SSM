package com.hu.service.impl;

import com.hu.dao.CompanyMapper;
import com.hu.pojo.Company;
import com.hu.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> selectAll() {
        return companyMapper.selectByExample(null);
    }

    @Override
    public Company selectCompanyBycomid(Integer id) {
        return companyMapper.selectCompanyBycomid(id);
    }

    @Override
    public void updatecp(Company company) {
        companyMapper.updatecp(company);
    }
}
