package com.seven.dao;

import com.seven.bean.CommunityUser;

public interface CommunityUserMapper {
    int insert(CommunityUser record);

    int insertSelective(CommunityUser record);
}