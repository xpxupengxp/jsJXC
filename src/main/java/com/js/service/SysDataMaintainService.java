package com.js.service;

import com.js.entity.SysDataMaintain;
import com.js.entity.SysEmployee;
import com.js.entity.SysUsers;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

import java.util.List;

public interface SysDataMaintainService {

    //删除
    ApiResponse delete(Long id);

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
