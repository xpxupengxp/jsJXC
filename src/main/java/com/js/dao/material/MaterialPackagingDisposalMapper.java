package com.js.dao.material;

import com.js.entity.material.MaterialPackagingDisposal;
import com.js.util.GenericDao;

/**
 *包装处置Dao
 */
public interface MaterialPackagingDisposalMapper extends GenericDao<MaterialPackagingDisposal> {

    //根据笔数id删除
    int deleteByMRealId(Long mRealId);

}