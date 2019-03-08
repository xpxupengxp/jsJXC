package com.js.service;

import com.js.entity.*;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface SysRolesService {

    //删除
    ApiResponse delete(Integer id);

    //添加
    ApiResponse insert(SysRoles sysRols);

    //通过主键查询
    SysRoles findById(Integer id);

    //分页查询
    ApiResponse findPageList(SysRoles sysRols, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(SysRoles sysRols);

    //修改
    ApiResponse update(SysRoles sysRols);

    //通过角色id获取用户
    ApiResponse getUsers(Integer id);

    //通过角色id获取权限
    ApiResponse getPerms(Integer id);

    //启用/停用角色
    void switchStatus(SysRoles sysRols);

    //设置角色权限
    ApiResponse setPerms(SysRolePermission sysRolePermission);
}
