package com.aaa.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aaa.dao.CompanyMapper;
import com.aaa.entity.Company;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class CompanyTest {
    @Autowired
    CompanyMapper mapper;
    @Test
    public void insert(){
        System.out.println("===============插入===============");
        Integer id = null;
        Company company = new Company();
        company.setCompanyName("测试公司");
        company.setCompanyAddress("河南郑州");
        company.setCompanyLinkman("A君");
        company.setCompanyTel("12345678901");
        company.setGmtCreate(new Date());
        company.setOperator("测试");
        mapper.insert(company);
        id = company.getCompanyId();
        System.out.println("-----------------------------"+id+"-----------------------------");
        System.out.println("===============查询公司===============");
        List<Company> list = mapper.selectByExample(null);
        for (Company companys : list) {
            System.out.println(companys);
        }
        mapper.deleteByPrimaryKey(id);
    }
//    @Test
    public void select(){
        System.out.println("===============查询公司===============");
        List<Company> list = mapper.selectByExample(null);
        for (Company company : list) {
            System.out.println(company);
        }
    }
}
