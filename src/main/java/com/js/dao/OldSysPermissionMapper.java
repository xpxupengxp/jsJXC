package com.js.dao;

import com.js.entity.OldSysPermission;
import com.js.entity.SysRoles;
import com.js.entity.SysUsers;
import com.js.util.GenericDao;

import java.util.List;

public interface OldSysPermissionMapper extends GenericDao<OldSysPermission> {

    //通过主键删除(物理删除)
    int delete(Integer permsId);

    //通过权限id查询角色
    List<SysRoles> getRoles(Integer permsId);

    //通过权限id查询用户
    List<SysUsers> getUsers(Integer permsId);

}