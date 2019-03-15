package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseMAlertForm;
import com.js.util.GenericDao;

public interface WarehouseMAlertFormMapper extends GenericDao<WarehouseMAlertForm> {
    int delete(Integer id);

}