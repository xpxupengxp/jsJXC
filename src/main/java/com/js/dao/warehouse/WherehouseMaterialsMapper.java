package com.js.dao.warehouse;

import com.js.entity.warehouse.WherehouseMaterials;
import com.js.util.GenericDao;

public interface WherehouseMaterialsMapper extends GenericDao<WherehouseMaterials> {
    int delete(Long id);
}