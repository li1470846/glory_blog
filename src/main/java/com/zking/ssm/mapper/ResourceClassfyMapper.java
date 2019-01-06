package com.zking.ssm.mapper;

import com.zking.ssm.model.ResourceClassfy;

public interface ResourceClassfyMapper {
    int deleteByPrimaryKey(Integer resourceClassfyId);

    int insert(ResourceClassfy record);

    int insertSelective(ResourceClassfy record);

    ResourceClassfy selectByPrimaryKey(Integer resourceClassfyId);

    int updateByPrimaryKeySelective(ResourceClassfy record);

    int updateByPrimaryKey(ResourceClassfy record);
}