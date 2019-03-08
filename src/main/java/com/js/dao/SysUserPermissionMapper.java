package com.js.dao;

import com.js.entity.SysUserPermission;
import com.js.util.GenericDao;

public interface SysUserPermissionMapper extends GenericDao<SysUserPermission> {
    int deleteByUserId(Integer userId);


}