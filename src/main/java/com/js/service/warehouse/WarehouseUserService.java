package com.js.service.warehouse;

import com.js.entity.warehouse.WarehouseUser;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseUserService {
//    //删除
//    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(WarehouseUser warehouseUser);

    //通过主键查询
    WarehouseUser findById(Integer id);

    //分页查询
    ApiResponse findPageList(WarehouseUser warehouseUser, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseUser warehouseUser);
}
