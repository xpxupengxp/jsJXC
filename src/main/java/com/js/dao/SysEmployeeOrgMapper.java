package com.js.dao;

import com.js.entity.Org;
import com.js.entity.SysEmployeeOrg;
import com.js.entity.SysUsers;
import com.js.util.GenericDao;

public interface SysEmployeeOrgMapper extends GenericDao<SysEmployeeOrg> {
    //根据用户id获取组织
    Org findOrgByUserId(Integer userId);

    //根据组织id获取用户
    SysUsers findUserByOrgId(Integer orgId);
}