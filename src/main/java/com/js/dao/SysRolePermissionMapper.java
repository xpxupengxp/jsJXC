package com.js.dao;

import com.js.entity.SysRolePermission;
import com.js.util.GenericDao;

public interface SysRolePermissionMapper extends GenericDao<SysRolePermission> {
    int delete(Integer id);

    //通过roleId删除权限
    int deleteByRoleId(Integer roleId);
}