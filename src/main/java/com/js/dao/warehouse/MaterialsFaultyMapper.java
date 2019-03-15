package com.js.dao.warehouse;

import com.js.entity.warehouse.MaterialsFaulty;
import com.js.util.GenericDao;

public interface MaterialsFaultyMapper extends GenericDao<MaterialsFaulty> {
    int delete(Long mId);

}