package com.js.service;

import com.js.entity.OldSysPermission;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface OldSysPermissionService {

    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(OldSysPermission oldSysPermission);

    //通过主键查询
    OldSysPermission findById(Integer id);

    //分页查询
    ApiResponse findPageList(OldSysPermission oldSysPermission, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(OldSysPermission oldSysPermission);

    //修改
    ApiResponse update(OldSysPermission oldSysPermission);

    //通过权限id查询角色
    ApiResponse getRoles(Integer permsId);

    //通过权限id查询用户
    ApiResponse getUsers(Integer permsId);

    //启用/停用权限
    void switchStatus(OldSysPermission oldSysPermission);
}
