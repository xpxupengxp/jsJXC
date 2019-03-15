package com.js.dao.material;

import com.js.entity.material.MaterialMergeRecord;

public interface MaterialMergeRecordMapper {
    int deleteByPrimaryKey(Long mRealId);

    int insert(MaterialMergeRecord record);

    int insertSelective(MaterialMergeRecord record);

    MaterialMergeRecord selectByPrimaryKey(Long mRealId);

    int updateByPrimaryKeySelective(MaterialMergeRecord record);

    int updateByPrimaryKey(MaterialMergeRecord record);
}