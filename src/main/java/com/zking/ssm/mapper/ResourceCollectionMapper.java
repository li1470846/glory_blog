package com.zking.ssm.mapper;

import com.zking.ssm.model.ResourceCollection;

public interface ResourceCollectionMapper {
    int deleteByPrimaryKey(Integer resourceCollectionId);

    int insert(ResourceCollection record);

    int insertSelective(ResourceCollection record);

    ResourceCollection selectByPrimaryKey(Integer resourceCollectionId);

    int updateByPrimaryKeySelective(ResourceCollection record);

    int updateByPrimaryKey(ResourceCollection record);
}