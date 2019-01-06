package com.zking.ssm.mapper;

import com.zking.ssm.model.Accusation;

public interface AccusationMapper {
    int deleteByPrimaryKey(Integer accusationId);

    int insert(Accusation record);

    int insertSelective(Accusation record);

    Accusation selectByPrimaryKey(Integer accusationId);

    int updateByPrimaryKeySelective(Accusation record);

    int updateByPrimaryKey(Accusation record);
}