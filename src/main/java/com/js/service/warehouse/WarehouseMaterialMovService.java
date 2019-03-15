package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseMaterialMov;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseMaterialMovService {
    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(WarehouseMaterialMov warehouseMaterialMov);

    //通过主键查询
    WarehouseMaterialMov findById(Long id);

    //分页查询
    ApiResponse findPageList(WarehouseMaterialMov warehouseMaterialMov, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseMaterialMov warehouseMaterialMov);
}
