package com.js.dao.warehouse;

import com.js.entity.warehouse.Warehouse;
import com.js.util.GenericDao;

public interface WarehouseMapper extends GenericDao<Warehouse> {
    int delete(Integer whId);

}