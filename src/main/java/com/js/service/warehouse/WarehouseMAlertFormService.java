package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseMAlertForm;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WarehouseMAlertFormService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(WarehouseMAlertForm warehouseMAlertForm);

    //通过主键查询
    WarehouseMAlertForm findById(Integer id);

    //分页查询
    ApiResponse findPageList(WarehouseMAlertForm warehouseMAlertForm, PageUtil pageUtil);

    //修改
    ApiResponse update(WarehouseMAlertForm warehouseMAlertForm);
}
