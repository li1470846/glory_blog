package com.zking.ssm.mapper;

import com.zking.ssm.model.UserClassfy;

public interface UserClassfyMapper {
    int deleteByPrimaryKey(Integer userClassfyId);

    int insert(UserClassfy record);

    int insertSelective(UserClassfy record);

    UserClassfy selectByPrimaryKey(Integer userClassfyId);

    int updateByPrimaryKeySelective(UserClassfy record);

    int updateByPrimaryKey(UserClassfy record);
}