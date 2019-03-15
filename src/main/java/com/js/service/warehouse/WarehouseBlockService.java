package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseBlock;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseBlockService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(WarehouseBlock warehouseBlock);

    //通过主键查询
    WarehouseBlock findById(Integer id);

    //分页查询
    ApiResponse findPageList(WarehouseBlock warehouseBlock, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseBlock warehouseBlock);
}
