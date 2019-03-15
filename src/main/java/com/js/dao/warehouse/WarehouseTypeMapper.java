package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseType;
import com.js.util.GenericDao;

public interface WarehouseTypeMapper extends GenericDao<WarehouseType> {
    int delete(Integer id);

}