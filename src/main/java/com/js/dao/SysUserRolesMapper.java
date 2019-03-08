package com.js.dao;

import com.js.entity.SysUserRoles;
import com.js.util.GenericDao;

public interface SysUserRolesMapper extends GenericDao<SysUserRoles> {

    //通过userId删除数据
    int deleteByUserId(Integer userId);





}