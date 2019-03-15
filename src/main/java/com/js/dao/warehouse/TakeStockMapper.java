package com.js.dao.warehouse;

import com.js.entity.warehouse.TakeStock;
import com.js.util.GenericDao;

public interface TakeStockMapper extends GenericDao<TakeStock> {
    int delete(Long tsId);

}