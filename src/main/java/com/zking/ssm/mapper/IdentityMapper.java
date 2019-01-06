package com.zking.ssm.mapper;

import com.zking.ssm.model.Identity;

public interface IdentityMapper {
    int deleteByPrimaryKey(Integer identityId);

    int insert(Identity record);

    int insertSelective(Identity record);

    Identity selectByPrimaryKey(Integer identityId);

    int updateByPrimaryKeySelective(Identity record);

    int updateByPrimaryKey(Identity record);
}