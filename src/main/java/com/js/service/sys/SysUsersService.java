package com.js.service.sys;

import com.js.entity.sys.SysUserPermission;
import com.js.entity.sys.SysUserRoles;
import com.js.entity.sys.SysUsers;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface SysUsersService {

    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(SysUsers sysUsers);

    //通过主键查询
    SysUsers findById(Integer id);

    //分页查询
    ApiResponse findPageList(SysUsers sysUsers, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(SysUsers sysUsers);

    //修改
    ApiResponse update(SysUsers sysUsers);

    //通过id获取角色
    ApiResponse getRolesById(Integer id);

    //通过id获取权限
    ApiResponse getPermsById(Integer id);

    //启用/停用用户
    void switchStatus(SysUsers sysUsers);

    //通过userId设置密码
    ApiResponse setPassword(SysUsers sysUsers);

    //通过userId设置角色
    ApiResponse setRoles(SysUserRoles sysUserRoles);

    //通过userId设置权限
    ApiResponse setPerms(SysUserPermission sysUserPermission);

}
