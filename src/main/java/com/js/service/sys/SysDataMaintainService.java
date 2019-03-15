package com.js.service.sys;

import com.js.entity.sys.SysDataMaintain;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface SysDataMaintainService {

    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(SysDataMaintain sysDataMaintain);

    //通过主键查询
    SysDataMaintain findById(Long id);

    //分页查询
    ApiResponse findPageList(SysDataMaintain sysDataMaintain, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(SysDataMaintain sysDataMaintain);

    //修改
    ApiResponse update(SysDataMaintain sysDataMaintain);
}
