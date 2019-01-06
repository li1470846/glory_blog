package com.zking.ssm.mapper;

import com.zking.ssm.model.Attention;

public interface AttentionMapper {
    int deleteByPrimaryKey(Integer attentionId);

    int insert(Attention record);

    int insertSelective(Attention record);

    Attention selectByPrimaryKey(Integer attentionId);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}