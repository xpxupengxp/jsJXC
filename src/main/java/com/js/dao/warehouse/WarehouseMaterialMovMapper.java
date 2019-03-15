package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseMaterialMov;
import com.js.util.GenericDao;

public interface WarehouseMaterialMovMapper extends GenericDao<WarehouseMaterialMov> {
    int delete(Long id);
}