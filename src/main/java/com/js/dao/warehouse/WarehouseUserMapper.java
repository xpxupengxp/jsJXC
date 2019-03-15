package com.js.dao.warehouse;

import com.js.entity.warehouse.WarehouseUser;
import com.js.util.GenericDao;

public interface WarehouseUserMapper extends GenericDao<WarehouseUser> {
    //通过仓库id删除
    int deleteByWhId(Integer whId);




}