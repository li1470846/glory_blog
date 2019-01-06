package com.zking.ssm.mapper;

import com.zking.ssm.model.ArticleComment;

public interface ArticleCommentMapper {
    int deleteByPrimaryKey(Integer articleCommentId);

    int insert(ArticleComment record);

    int insertSelective(ArticleComment record);

    ArticleComment selectByPrimaryKey(Integer articleCommentId);

    int updateByPrimaryKeySelective(ArticleComment record);

    int updateByPrimaryKey(ArticleComment record);
}