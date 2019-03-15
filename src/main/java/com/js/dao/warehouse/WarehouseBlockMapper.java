package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseBlock;
import com.js.util.GenericDao;

public interface WarehouseBlockMapper extends GenericDao<WarehouseBlock> {
    int delete(Integer wbId);

}