package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseblockMaterialObject;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseblockMaterialObjectService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(WarehouseblockMaterialObject warehouseblockMaterialObject);

    //通过主键查询
    WarehouseblockMaterialObject findById(Integer id);

    //分页查询
    ApiResponse findPageList(WarehouseblockMaterialObject warehouseblockMaterialObject, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseblockMaterialObject warehouseblockMaterialObject);
}
