package com.aaa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aaa.dao.AssessmentMapper;
import com.aaa.entity.Assessment;
import com.aaa.entity.AssessmentExample;
import com.aaa.entity.Color;
import com.aaa.entity.ColorExample;

@Service
public class AssessmentService {
@Autowired
private AssessmentMapper am;
/*
 * 分页查询
 */
public List<Assessment> queryPage(Integer pageNum, Integer pageSize) {
	AssessmentExample ae = new AssessmentExample();

	if (pageNum != null) {
		ae.setOffset((pageNum - 1) * pageSize);
		ae.setLimit(pageSize);
	}
	return am.selectByExample(ae);
}
/*
 * 普通查询
 */
public List<Assessment> selectByExample(AssessmentExample example){
	return am.selectByExample(example);
}
/*
 * 添加
 */
public String insert(Assessment record){
	 int i = am.insert(record);  
     String message="";  
     if(i > 0){  
         message = "添加成功";  
     }else{  
         message = "添加失败";  
     }  
     return message;  

}
public Assessment selectByPrimaryKey(Integer id){
	return am.selectByPrimaryKey(id);
	
}
public long getCount() {
	return am.countByExample(null);
}
}
