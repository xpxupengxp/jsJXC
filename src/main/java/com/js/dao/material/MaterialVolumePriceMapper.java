package com.js.dao.material;

import com.js.entity.material.MaterialVolumePrice;
import com.js.util.GenericDao;

/**
 * 物料量价Dao
 */
public interface MaterialVolumePriceMapper extends GenericDao<MaterialVolumePrice> {

    //根据笔数id删除
    int deleteByMRealId(Long mRealId);

}