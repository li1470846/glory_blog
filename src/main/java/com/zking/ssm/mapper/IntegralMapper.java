package com.zking.ssm.mapper;

import com.zking.ssm.model.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Integer integralId);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Integer integralId);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}