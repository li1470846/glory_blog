package com.zking.ssm.mapper;

import com.zking.ssm.model.ArticleCollection;

public interface ArticleCollectionMapper {
    int deleteByPrimaryKey(Integer articleCollectionId);

    int insert(ArticleCollection record);

    int insertSelective(ArticleCollection record);

    ArticleCollection selectByPrimaryKey(Integer articleCollectionId);

    int updateByPrimaryKeySelective(ArticleCollection record);

    int updateByPrimaryKey(ArticleCollection record);
}