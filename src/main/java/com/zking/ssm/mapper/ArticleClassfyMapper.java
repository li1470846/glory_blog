package com.zking.ssm.mapper;

import com.zking.ssm.model.ArticleClassfy;

public interface ArticleClassfyMapper {
    int deleteByPrimaryKey(Integer articleClassfyId);

    int insert(ArticleClassfy record);

    int insertSelective(ArticleClassfy record);

    ArticleClassfy selectByPrimaryKey(Integer articleClassfyId);

    int updateByPrimaryKeySelective(ArticleClassfy record);

    int updateByPrimaryKey(ArticleClassfy record);
}