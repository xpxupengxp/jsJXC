package com.js.dao.sys;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.sys.SysRoles;
import com.js.entity.sys.SysUsers;
import com.js.util.GenericDao;

import java.util.List;

public interface SysRolesMapper extends GenericDao<SysRoles> {

    //通过主键删除(物理删除)
    int delete(Integer id);

    //通过角色id获取用户
    List<SysUsers> getUsersByRoleId(Integer id);

    //通过角色id获取权限
    List<OldSysPermission> getPermsByRoleId(Integer id);

}