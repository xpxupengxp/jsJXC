package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.MaterialsFaulty;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface MaterialsFaultyService {

    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(MaterialsFaulty materialsFaulty);

    //通过主键查询
    MaterialsFaulty findById(Integer id);

    //分页查询
    ApiResponse findPageList(MaterialsFaulty materialsFaulty, PageUtil pageUtil);

    //修改
    ApiResponse update(MaterialsFaulty materialsFaulty);
}
