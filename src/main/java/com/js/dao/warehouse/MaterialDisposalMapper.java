package com.js.dao.warehouse;

import com.js.entity.warehouse.MaterialDisposal;
import com.js.util.GenericDao;

public interface MaterialDisposalMapper extends GenericDao<MaterialDisposal> {
    int delete(Long mRealId);
}