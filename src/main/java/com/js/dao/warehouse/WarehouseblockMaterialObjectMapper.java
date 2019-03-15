package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseblockMaterialObject;
import com.js.util.GenericDao;

public interface WarehouseblockMaterialObjectMapper extends GenericDao<WarehouseblockMaterialObject> {
    int delete(Integer id);

}