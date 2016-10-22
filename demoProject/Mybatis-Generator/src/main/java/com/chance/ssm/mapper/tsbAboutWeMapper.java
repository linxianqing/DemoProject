package com.chance.ssm.mapper;

import com.chance.ssm.po.tsbAboutWe;
import com.chance.ssm.po.tsbAboutWeExample;
import java.util.List;

public interface tsbAboutWeMapper {
    int countByExample(tsbAboutWeExample example);

    int deleteByExample(tsbAboutWeExample example);

    int deleteByPrimaryKey(Integer aboutWeId);

    int insert(tsbAboutWe record);

    int insertSelective(tsbAboutWe record);

    List<tsbAboutWe> selectByExample(tsbAboutWeExample example);

    tsbAboutWe selectByPrimaryKey(Integer aboutWeId);

    int updateByPrimaryKeySelective(tsbAboutWe record);

    int updateByPrimaryKey(tsbAboutWe record);
}