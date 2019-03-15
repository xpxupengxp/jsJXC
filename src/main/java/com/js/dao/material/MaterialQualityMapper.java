package com.js.dao.material;

import com.js.entity.material.MaterialQuality;
import com.js.util.GenericDao;

public interface MaterialQualityMapper extends GenericDao<MaterialQuality> {

    //根据笔数id删除
    int deleteByMRealId(Long mRealId);

}