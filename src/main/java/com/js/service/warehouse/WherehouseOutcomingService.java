package com.js.service.warehouse;

import com.js.entity.warehouse.WherehouseOutcoming;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WherehouseOutcomingService {
    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(WherehouseOutcoming wherehouseOutcoming);

    //通过主键查询
    WherehouseOutcoming findById(Long id);

    //分页查询
    ApiResponse findPageList(WherehouseOutcoming wherehouseOutcoming, PageUtil pageUtil);

    //修改
    ApiResponse update(WherehouseOutcoming wherehouseOutcoming);
}
