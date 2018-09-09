package com.zk.mapper.master;

import com.zk.entity.master.PrizeUser;

public interface PrizeUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PrizeUser record);

    int insertSelective(PrizeUser record);

    PrizeUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PrizeUser record);

    int updateByPrimaryKey(PrizeUser record);
}