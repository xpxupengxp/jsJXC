package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseType;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseTypeService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(WarehouseType warehouseType);

    //通过主键查询
    WarehouseType findById(Integer id);

    //分页查询
    ApiResponse findPageList(WarehouseType warehouseType, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseType warehouseType);
}
