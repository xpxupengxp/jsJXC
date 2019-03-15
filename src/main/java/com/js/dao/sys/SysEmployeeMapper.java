package com.js.dao.sys;

import com.js.entity.sys.Org;
import com.js.entity.sys.SysEmployee;
import com.js.entity.sys.SysUsers;
import com.js.util.GenericDao;

public interface SysEmployeeMapper extends GenericDao<SysEmployee> {

    //通过主键删除(物理删除)
    int delete(Integer userId);

    //根据员工id获取组织
    Org findOrgByUserId(Integer userId);

    //根据员工id获取用户
    SysUsers findUserByUserId(Integer userId);
}