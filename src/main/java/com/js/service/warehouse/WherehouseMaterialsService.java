package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WherehouseMaterials;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface WherehouseMaterialsService {

    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(WherehouseMaterials wherehouseMaterials);

    //通过主键查询
    WherehouseMaterials findById(Integer id);

    //分页查询
    ApiResponse findPageList(WherehouseMaterials wherehouseMaterials, PageUtil pageUtil);

    //修改
    ApiResponse update(WherehouseMaterials wherehouseMaterials);
}
