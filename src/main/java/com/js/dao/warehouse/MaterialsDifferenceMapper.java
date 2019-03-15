package com.js.dao.warehouse;

import com.js.entity.warehouse.MaterialsDifference;
import com.js.util.GenericDao;

public interface MaterialsDifferenceMapper extends GenericDao<MaterialsDifference> {
    int delete(Long mRealId);

}