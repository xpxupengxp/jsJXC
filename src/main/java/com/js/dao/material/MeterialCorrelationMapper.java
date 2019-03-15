package com.js.dao.material;

import com.js.entity.material.MeterialCorrelation;

public interface MeterialCorrelationMapper {
    int deleteByPrimaryKey(Long mRealId);

    int insert(MeterialCorrelation record);

    int insertSelective(MeterialCorrelation record);

    MeterialCorrelation selectByPrimaryKey(Long mRealId);

    int updateByPrimaryKeySelective(MeterialCorrelation record);

    int updateByPrimaryKey(MeterialCorrelation record);
}