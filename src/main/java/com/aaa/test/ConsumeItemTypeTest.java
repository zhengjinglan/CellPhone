package com.aaa.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aaa.dao.ConsumeItemTypeMapper;
import com.aaa.entity.ConsumeItemType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ConsumeItemTypeTest {
    ConsumeItemTypeMapper mapper;
    @Test
    public void insert(){
        ConsumeItemType type = new ConsumeItemType();
        
    }
}
