package com.zking.ssm.mapper;

import com.zking.ssm.model.ResourceType;

public interface ResourceTypeMapper {
    int deleteByPrimaryKey(Integer resourceTypeId);

    int insert(ResourceType record);

    int insertSelective(ResourceType record);

    ResourceType selectByPrimaryKey(Integer resourceTypeId);

    int updateByPrimaryKeySelective(ResourceType record);

    int updateByPrimaryKey(ResourceType record);
}