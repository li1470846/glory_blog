package com.zking.ssm.mapper;

import com.zking.ssm.model.ArticleVisit;

public interface ArticleVisitMapper {
    int deleteByPrimaryKey(Integer articleVisitId);

    int insert(ArticleVisit record);

    int insertSelective(ArticleVisit record);

    ArticleVisit selectByPrimaryKey(Integer articleVisitId);

    int updateByPrimaryKeySelective(ArticleVisit record);

    int updateByPrimaryKey(ArticleVisit record);
}