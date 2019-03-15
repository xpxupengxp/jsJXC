package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.TakeStock;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface TakeStockService {
    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(TakeStock takeStock);

    //通过主键查询
    TakeStock findById(Long id);

    //分页查询
    ApiResponse findPageList(TakeStock takeStock, PageUtil pageUtil);

    //修改
    ApiResponse update(TakeStock takeStock);
}
