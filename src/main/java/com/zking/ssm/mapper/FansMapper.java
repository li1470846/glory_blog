package com.zking.ssm.mapper;

import com.zking.ssm.model.Fans;

public interface FansMapper {
    int deleteByPrimaryKey(Integer fansId);

    int insert(Fans record);

    int insertSelective(Fans record);

    Fans selectByPrimaryKey(Integer fansId);

    int updateByPrimaryKeySelective(Fans record);

    int updateByPrimaryKey(Fans record);
}