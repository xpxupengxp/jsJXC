package com.js.dao.material;

import com.js.entity.material.MaterialFactoryInformation;
import com.js.util.GenericDao;

/**
 * 物料出厂信息Dao
 */
public interface MaterialFactoryInformationMapper extends GenericDao<MaterialFactoryInformation> {

    //根据笔数id删除
    int deleteByMRealId(Long mRealId);

}