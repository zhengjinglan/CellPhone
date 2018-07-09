package com.aaa.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.CompanyMapper;
import com.aaa.entity.Company;
import com.aaa.entity.CompanyExample;

@Service
public class CompanyService {
    @Autowired
    CompanyMapper mapper;

    public List<Company> queryPage(Integer pageNum,Integer pageSize){
        CompanyExample exp = new CompanyExample();
        if (pageNum != null) {
            exp.setOffset((pageNum - 1) * pageSize);
            exp.setLimit(pageSize);
        }
        return mapper.selectByExample(exp);
    }
    public long getCount(){
        return mapper.countByExample(null);
    }
    /**
     * 添加供应商信息
     * 需要包括地址、联系人、名称、电话和操作人的信息
     * @param company
     * @return
     */
    public int add(Company company){
        company.setGmtCreate(new Date());
        return mapper.insertSelective(company);
    }
    public boolean remove(int companyId){
        int res = mapper.deleteByPrimaryKey(companyId);
        if(res > 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean remove(List<Integer> ids){
        CompanyExample exp = new CompanyExample();
        exp.createCriteria().andCompanyIdIn(ids);
        int res = mapper.deleteByExample(exp);
        return res>0?true:false;
    }
    public boolean remove(CompanyExample exp){
        int res = mapper.deleteByExample(exp);
        if(res > 0){
            return true;
        }else{
            return false;
        }
    }
    public int update(Company company){
        company.setGmtModified(new Date());
        return mapper.updateByPrimaryKeySelective(company);
    }
    public List<Company> list(){
        return mapper.selectByExample(null);
    }
    /**
     * 
     * @author 小黑
     * @date 2018年7月10日 上午1:38:21
     *
     * @param companyName
     * @return true表示存在,false表示不存在
     */
    public boolean existCompanyName(String companyName){
        CompanyExample exp = new CompanyExample();
        exp.createCriteria().andCompanyNameEqualTo(companyName);
        return mapper.selectByExample(exp).size() > 0 ? true : false;
    }
}
