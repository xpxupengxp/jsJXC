package com.js.dao.material;

import com.js.entity.material.MaterialSplitRecord;

public interface MaterialSplitRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MaterialSplitRecord record);

    int insertSelective(MaterialSplitRecord record);

    MaterialSplitRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MaterialSplitRecord record);

    int updateByPrimaryKey(MaterialSplitRecord record);
}