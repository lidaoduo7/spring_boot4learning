package com.seven.dao;

import com.seven.bean.CommunityService;

public interface CommunityServiceMapper {
    int insert(CommunityService record);

    int insertSelective(CommunityService record);
}