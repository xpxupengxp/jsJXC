package com.js.dao.sys;

import com.js.entity.sys.SysUserPermission;
import com.js.util.GenericDao;

public interface SysUserPermissionMapper extends GenericDao<SysUserPermission> {
    int deleteByUserId(Integer userId);


}