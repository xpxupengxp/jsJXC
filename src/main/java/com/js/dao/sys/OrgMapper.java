package com.js.dao.sys;

import com.js.entity.sys.Org;
import com.js.entity.sys.SysUsers;
import com.js.util.GenericDao;

public interface OrgMapper extends GenericDao<Org> {

    //通过主键删除(物理删除)
    int delete(Integer orgId);

    //根据组织id获取用户
    SysUsers findUserByOrgId(Integer orgId);
}