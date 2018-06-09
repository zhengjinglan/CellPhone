package com.aaa.dao;

import com.aaa.entity.MailInfo;
import com.aaa.entity.MailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailInfoMapper {
    long countByExample(MailInfoExample example);

    int deleteByExample(MailInfoExample example);

    int deleteByPrimaryKey(Integer infoId);

    int insert(MailInfo record);

    int insertSelective(MailInfo record);

    List<MailInfo> selectByExample(MailInfoExample example);

    MailInfo selectByPrimaryKey(Integer infoId);

    int updateByExampleSelective(@Param("record") MailInfo record, @Param("example") MailInfoExample example);

    int updateByExample(@Param("record") MailInfo record, @Param("example") MailInfoExample example);

    int updateByPrimaryKeySelective(MailInfo record);

    int updateByPrimaryKey(MailInfo record);
}