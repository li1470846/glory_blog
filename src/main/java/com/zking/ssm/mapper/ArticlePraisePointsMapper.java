package com.zking.ssm.mapper;

import com.zking.ssm.model.ArticlePraisePoints;

public interface ArticlePraisePointsMapper {
    int deleteByPrimaryKey(Long appId);

    int insert(ArticlePraisePoints record);

    int insertSelective(ArticlePraisePoints record);

    ArticlePraisePoints selectByPrimaryKey(Long appId);

    int updateByPrimaryKeySelective(ArticlePraisePoints record);

    int updateByPrimaryKey(ArticlePraisePoints record);
}