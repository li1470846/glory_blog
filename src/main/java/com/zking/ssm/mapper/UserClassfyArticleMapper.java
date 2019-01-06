package com.zking.ssm.mapper;

import com.zking.ssm.model.UserClassfyArticle;

public interface UserClassfyArticleMapper {
    int deleteByPrimaryKey(Integer userClassfyArticleId);

    int insert(UserClassfyArticle record);

    int insertSelective(UserClassfyArticle record);

    UserClassfyArticle selectByPrimaryKey(Integer userClassfyArticleId);

    int updateByPrimaryKeySelective(UserClassfyArticle record);

    int updateByPrimaryKey(UserClassfyArticle record);
}