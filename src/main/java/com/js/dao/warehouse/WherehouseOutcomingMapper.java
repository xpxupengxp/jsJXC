package com.js.dao.warehouse;

import com.js.entity.warehouse.WherehouseOutcoming;
import com.js.util.GenericDao;

public interface WherehouseOutcomingMapper extends GenericDao<WherehouseOutcoming> {
    int delete(Long id);

}