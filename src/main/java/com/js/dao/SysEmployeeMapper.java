package com.js.dao;

import com.js.entity.Org;
import com.js.entity.SysEmployee;
import com.js.entity.SysUsers;
import com.js.util.GenericDao;

import java.util.List;

public interface SysEmployeeMapper extends GenericDao<SysEmployee> {

    //通过主键删除(物理删除)
    int delete(Integer userId);

    //根据员工id获取组织
    Org findOrgByUserId(Integer userId);

    //根据员工id获取用户
    SysUsers findUserByUserId(Integer userId);
}