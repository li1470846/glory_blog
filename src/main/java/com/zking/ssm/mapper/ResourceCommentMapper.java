package com.zking.ssm.mapper;

import com.zking.ssm.model.ResourceComment;

public interface ResourceCommentMapper {
    int deleteByPrimaryKey(Integer resourceCommentId);

    int insert(ResourceComment record);

    int insertSelective(ResourceComment record);

    ResourceComment selectByPrimaryKey(Integer resourceCommentId);

    int updateByPrimaryKeySelective(ResourceComment record);

    int updateByPrimaryKey(ResourceComment record);
}