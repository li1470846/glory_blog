package com.zking.ssm.mapper;

import com.zking.ssm.model.Download;

public interface DownloadMapper {
    int deleteByPrimaryKey(Integer downloadId);

    int insert(Download record);

    int insertSelective(Download record);

    Download selectByPrimaryKey(Integer downloadId);

    int updateByPrimaryKeySelective(Download record);

    int updateByPrimaryKey(Download record);
}