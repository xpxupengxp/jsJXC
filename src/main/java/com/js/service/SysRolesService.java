package com.js.service;

import com.js.entity.*;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface SysRolesService {

    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(SysRoles sysRoles);

    //通过主键查询
    SysRoles findById(Integer id);

    //分页查询
    ApiResponse findPageList(SysRoles sysRoles, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(SysRoles sysRoles);

    //修改
    ApiResponse update(SysRoles sysRoles);

    //通过角色id获取用户
    ApiResponse getUsers(Integer id);

    //通过角色id获取权限
    ApiResponse getPerms(Integer id);

    //启用/停用角色
    void switchStatus(SysRoles sysRoles);

    //设置角色权限
    ApiResponse setPerms(SysRolePermission sysRolePermission);
}
