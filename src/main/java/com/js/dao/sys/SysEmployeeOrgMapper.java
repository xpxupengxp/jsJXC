package com.js.dao.sys;

import com.js.entity.sys.Org;
import com.js.entity.sys.SysEmployeeOrg;
import com.js.entity.sys.SysUsers;
import com.js.util.GenericDao;

public interface SysEmployeeOrgMapper extends GenericDao<SysEmployeeOrg> {
    //根据用户id获取组织
    Org findOrgByUserId(Integer userId);

    //根据组织id获取用户
    SysUsers findUserByOrgId(Integer orgId);
}