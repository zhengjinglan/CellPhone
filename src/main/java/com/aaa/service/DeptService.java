package com.aaa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.DeptMapper;
import com.aaa.dao.EmpMapper;
import com.aaa.entity.Dept;
import com.aaa.entity.DeptExample;

@Service
public class DeptService {

	@Autowired
	DeptMapper deptMapper;
	@Autowired
	EmpMapper empMapper;

    public List<Dept> queryPage(Integer pageNum, Integer pageSize) {
        DeptExample deptExample = new DeptExample();

        if (pageNum != null) {
            deptExample.setOffset((pageNum - 1) * pageSize);
            deptExample.setLimit(pageSize);
        }
        return deptMapper.selectByExample(deptExample);
    }

    public List<Dept> queryAll(Dept dept) {
        DeptExample deptExample = new DeptExample();
        return deptMapper.selectByExample(deptExample);
    }

	public int dels(Integer[] ids) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : ids) {
			// if (empMapper.selectAll(i).SIZE = 0) {
			list.add(i);
			// }
		}
		DeptExample dept = new DeptExample();
		dept.createCriteria().andDeptIdIn(list);
		int rs = deptMapper.deleteByExample(dept);
		if (rs == ids.length) {
			return 0;
		} else {
			return -1;
		}
	}

    public int add(Dept dept) {
        System.out.println(dept);
        return deptMapper.insert(dept);
    }

    public int update(Dept dept) {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDeptIdEqualTo(dept.getDeptId());

        return deptMapper.updateByExampleSelective(dept, deptExample);
    }

    public long getCount() {
        return deptMapper.countByExample(null);
    }
    /**
     * 
     * @author 小黑
     * @date 2018年7月10日 上午2:30:17
     * @see com.aaa.service.ConsumeItemService#existItemName(String)
     * @param deptName
     * @return
     */
    public boolean existDeptName(String deptName){
        DeptExample exp = new DeptExample();
        exp.createCriteria().andDeptNameEqualTo(deptName);
        return deptMapper.selectByExample(exp).size() > 0 ? true : false;
    }
}
