package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.Warehouse;
import com.js.entity.warehouse.WarehouseUser;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(Warehouse warehouse);

    //通过主键查询
    Warehouse findById(Integer id);

    //分页查询
    ApiResponse findPageList(Warehouse warehouse, PageUtil pageUtil);

    //修改
    ApiResponse update(Warehouse warehouse);

    //添加库管员
    ApiResponse insertWarehouseUser(WarehouseUser warehouseUser);

    //删除库管员
    ApiResponse deleteWarehouseUser(WarehouseUser warehouseUser);
}
